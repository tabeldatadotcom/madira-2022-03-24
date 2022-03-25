package com.maryanto.dimas.bootcamp.service;

import com.maryanto.dimas.bootcamp.entity.Buku;

public class BukuService {

    public void insert(Buku data) {
//        insert data buku
//        System.out.println("buku: { isbn: " + data.getIsbn() + ", title: " + data.getTitle() + "}");
        data.setYearPublished(2022);
        if (data.getYearPublished() >= 2022) {
            System.out.println("Buku baru");
        } else if (data.getYearPublished() == 2022) {
            System.out.println("buku lama");
        } else {
            System.out.println("buku lainnya");
        }

//        data = PemOgr4m4n
        data.setTitle("pemOgr4m4n");
        if (data.getTitle().equalsIgnoreCase("pemOgr4m4n")) { // true
            System.out.println("nilainya sama dari eqicase");
        } else if (data.getTitle().equals("PemOgr4m4n")) { // true
            System.out.println("nilainya sama dari eques");
        }
    }

}
