package com.maryanto.dimas.bootcamp.service;

public class PostgreSQLConfig implements DatabaseConnect {
    @Override
    public void connect() {
        System.out.println("connect ke database postgresql");
    }
}
