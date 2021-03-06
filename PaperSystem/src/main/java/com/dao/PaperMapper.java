package com.dao;

import com.pojo.Paper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperMapper {

    /**
     * 查询所有
     */
    List<Paper> findAllPaper();

    /**
     * 根据id删除
     */
    boolean deleteById(long id);
}
