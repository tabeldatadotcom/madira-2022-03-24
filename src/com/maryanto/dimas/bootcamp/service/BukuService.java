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

    public void update(Buku data) {
//        i = i + 1
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i + " adalah bilangan genap");
            else
                System.out.println(i + " adalah bilangan ganjil");
        }
    }

    public void updateBuku() {
        int index = 0;
        while (index < 100) {
            System.out.println("saya index ke " + index);
            index++;
        }

//        index = 0;
//        do {
//
//            index++;
//        } while (index < 100);
    }

}
