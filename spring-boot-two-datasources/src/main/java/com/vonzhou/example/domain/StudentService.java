package com.vonzhou.example.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author vonzhou
 * @version 2018/10/17
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @PostConstruct
    public void init() {
        long id = 1;
        System.out.println(String.format("Student ID %s : %s", id, getById(id)));
    }

    private Student getById(long id) {
        Student q = new Student();
        q.setId(id);
        return studentMapper.selectByPrimaryKey(q);
    }

}
