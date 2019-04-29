package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entitiy.PageResult;
import entitiy.Result;
import entitiy.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


/**
 * 标签控制层
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }

    /**
     * 根据id查询标签
     */
    @RequestMapping(value = "/{id}",method =RequestMethod.GET)
    public Result findById(@PathVariable String id){
        return new Result(true,StatusCode.OK,"查询成功",labelService.findById(id));
    }
    /**
     * 添加标签
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result addLabel(@RequestBody Label label){
        labelService.addLabel(label);
        return new Result(true,StatusCode.OK,"添加成功");
    }
    /**
     * 根据标签id更新标签
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result updateLabel(@PathVariable String id,@RequestBody Label label){
        label.setId(id);
        labelService.updateById(label);
        return new Result(true,StatusCode.OK,"更新成功");
    }
    /**
     * 根据id删除
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"操作成功");
    }

    /**
     * 条件查询
     * @param label
     * @return
     */
    @RequestMapping(value="/search",method =RequestMethod.POST)
    public Result findSearch(@RequestBody Label label ){

         return new Result(true,StatusCode.OK,"查询成功 ",labelService.findSearch(label));
    }
    /**
     *条件分页查询
     */
    @RequestMapping(value="search/{page}/{size}",method =RequestMethod.POST)
    public Result pageQuery(@RequestBody Label label,@PathVariable int page,@PathVariable int size ){
        Page<Label> pageList=labelService.pageQuery(label,page,size);
        return new Result(true,StatusCode.OK,"查询成功 ",new PageResult<Label>(pageList.getTotalElements(),pageList.getContent()));
    }
}
