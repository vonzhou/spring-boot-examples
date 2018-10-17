package com.vonzhou.example.domain2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author vonzhou
 * @version 2018/10/17
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @PostConstruct
    public void init() {
        long id = 1;
        System.out.println(String.format("Teacher" +
                " ID %s : %s", id, getById(id)));
    }

    private Teacher getById(long id) {
        Teacher q = new Teacher();
        q.setId(id);
        return teacherMapper.selectByPrimaryKey(q);
    }

}
