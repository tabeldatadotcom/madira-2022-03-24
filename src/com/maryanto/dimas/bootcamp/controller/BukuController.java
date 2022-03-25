package com.maryanto.dimas.bootcamp.controller;

import com.maryanto.dimas.bootcamp.entity.Buku;
import com.maryanto.dimas.bootcamp.entity.Kendaraan;
import com.maryanto.dimas.bootcamp.entity.Mobil;
import com.maryanto.dimas.bootcamp.entity.Motor;
import com.maryanto.dimas.bootcamp.service.BukuService;
import com.maryanto.dimas.bootcamp.service.DatabaseConnect;
import com.maryanto.dimas.bootcamp.service.MysqlConfig;

import java.time.LocalDateTime;

public class BukuController {

    private BukuService service;

    public void insert() {
        Buku pemograman = new Buku();
        pemograman.setTitle("Bahasa pemograman");
        pemograman.setCreatedAt(LocalDateTime.now());
        pemograman.setIsbn("1234");

        this.service = new BukuService();
        service.insert(pemograman);
    }

    public void update() {
        this.service = new BukuService();
//        service.update(new Buku());
//        service.updateBuku();
//        service.list();
        service.listBuku();
    }

    public void findByKendaraan() {
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setCc(1000);
        kendaraan.setMerk("Honda");
        kendaraan.setRoda(4);

        System.out.println("merk: " + kendaraan.getMerk());
    }

    public void findByMobil() {
        Mobil hondaCivic = new Mobil();
        hondaCivic.setSpion("ada");
        hondaCivic.setStearing("ada");
        hondaCivic.setRoda(4);
        hondaCivic.setMerk("Honda");
        System.out.println("merk: " + hondaCivic.getMerk() + ", jumlah roda: " + hondaCivic.getRoda());
    }

    public void findByMotor() {
        Motor yamahaR1 = new Motor();
        yamahaR1.setKnalpot("ada");
        yamahaR1.setStang("ada");
        yamahaR1.setRoda(4);
        yamahaR1.setMerk("Yamaha");
        System.out.println("merk: " + yamahaR1.getMerk() + ", jumlah roda: " + yamahaR1.getRoda() + ", jenis: motor");
    }

    public void findByKendaraanMobilAndMotor() {
        Kendaraan yamahaR1 = new Motor();
        yamahaR1.setRoda(4);
        yamahaR1.setMerk("Yamaha");
        System.out.println("merk: " + yamahaR1.getMerk() + ", jumlah roda: " + yamahaR1.getRoda());
        Kendaraan hondaCivic = new Mobil();
        hondaCivic.setRoda(4);
        hondaCivic.setMerk("Honda");
        System.out.println("merk: " + hondaCivic.getMerk() + ", jumlah roda: " + hondaCivic.getRoda());

    }

    public Integer hitungKecepatan() {
        Kendaraan kendaraan = new Mobil();
        return kendaraan.hitungKecepatan(30, false);
    }

    public void gantiChannel() {
        DatabaseConnect db = new MysqlConfig();
        db.connect();
    }
}
