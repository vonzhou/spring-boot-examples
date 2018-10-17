package com.vonzhou.example.domain;

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
        Student s = new Student();
        s.setName("vonzhou");
        s.setInsertTime(System.currentTimeMillis());
        studentMapper.insertStudent(s);
        System.out.println(String.format("Student Inserted %s.", s.getId()));
    }


}
