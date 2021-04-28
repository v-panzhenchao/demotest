package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable {
    private int id;
    private String name;
    private String password;
    private String p;
}
