package com.service.impl;

import com.dao.PaperMapper;
import com.pojo.Paper;
import com.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperMapper paperMapper;
    @Override
    public List<Paper> findAllPaper() {
        return paperMapper.findAllPaper();
    }

    @Override
    public boolean deleteById(long id) {
        return paperMapper.deleteById(id);
    }
}
