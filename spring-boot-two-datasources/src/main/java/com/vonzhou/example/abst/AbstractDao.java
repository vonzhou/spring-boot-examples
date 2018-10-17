package com.vonzhou.example.abst;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


public interface AbstractDao<T> extends Mapper<T>, MySqlMapper<T> {
}
