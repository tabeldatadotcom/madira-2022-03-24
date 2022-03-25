package com.maryanto.dimas.bootcamp.entity;

public class Mobil extends Kendaraan {

    private String spion;
    private Integer jumlahPenumpang;
    private String stearing;

    public String getSpion() {
        return spion;
    }

    public void setSpion(String spion) {
        this.spion = spion;
    }

    public Integer getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(Integer jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String getStearing() {
        return stearing;
    }

    public void setStearing(String stearing) {
        this.stearing = stearing;
    }
}
