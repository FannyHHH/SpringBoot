package com.example.springboot08_ssmp.dao;

import com.alibaba.druid.support.json.JSONUtils;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot08_ssmp.domian.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
