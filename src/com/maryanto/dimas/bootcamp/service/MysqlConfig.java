package com.maryanto.dimas.bootcamp.service;

public class MysqlConfig implements DatabaseConnect {


    @Override
    public void connect() {
        System.out.println("connect ke database mysql");
    }
}
