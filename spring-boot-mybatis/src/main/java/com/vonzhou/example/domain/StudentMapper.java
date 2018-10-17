package com.vonzhou.example.domain;


import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author vonzhou
 * @version 2018/7/26
 */
@Mapper
public interface StudentMapper {

    void insertStudent(Student student);

}
