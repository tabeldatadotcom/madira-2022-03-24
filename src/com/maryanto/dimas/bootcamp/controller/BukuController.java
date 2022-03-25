package com.maryanto.dimas.bootcamp.controller;

import com.maryanto.dimas.bootcamp.entity.Buku;
import com.maryanto.dimas.bootcamp.service.BukuService;

import java.time.LocalDateTime;

public class BukuController {

    private BukuService service;

    public void insert(){
        Buku pemograman = new Buku();
        pemograman.setTitle("Bahasa pemograman");
        pemograman.setCreatedAt(LocalDateTime.now());
        pemograman.setIsbn("1234");

        this.service = new BukuService();
        service.insert(pemograman);
    }

    public void update(){
        this.service = new BukuService();
//        service.update(new Buku());
        service.updateBuku();
    }
}
