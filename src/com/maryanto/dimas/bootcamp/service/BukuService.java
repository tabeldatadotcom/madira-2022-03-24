package com.maryanto.dimas.bootcamp.service;

import com.maryanto.dimas.bootcamp.entity.Buku;

public class BukuService {

    public void insert(Buku data) {
//        insert data buku
        System.out.println("buku: { isbn: " + data.getIsbn() + ", title: " + data.getTitle() + "}");
    }
}
