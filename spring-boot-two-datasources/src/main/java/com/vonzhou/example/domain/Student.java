package com.vonzhou.example.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vonzhou
 * @version 2018/10/16
 */
@Data
@Table(name = "student")
public class Student {

    @Id
    private Long id;

    private String name;

    @Column(name = "insert_time")
    private Long insertTime;
}
