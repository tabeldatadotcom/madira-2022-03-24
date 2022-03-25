package com.maryanto.dimas.bootcamp.entity;

public class Kendaraan {

    private Integer roda;
    private String mesin;
    private Integer cc;
    private String merk;

    public Integer getRoda() {
        return roda;
    }

    public void setRoda(Integer roda) {
        this.roda = roda;
    }

    public String getMesin() {
        return mesin;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
