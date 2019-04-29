package com.controller;

import com.pojo.Paper;
import com.service.PaperService;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @RequestMapping("/allPaper")
    public String List(Model model){
        List<Paper> list = paperService.findAllPaper();
        model.addAttribute("list",list);
       return "allPaper";
    }

    @RequestMapping("/del/{paperId}")
    public String deleteById(@ProbeParam("paperId") long id){
        paperService.deleteById(id);
        return "redirect:/paper/allPaper";
    }

}
