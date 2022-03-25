package com.maryanto.dimas.bootcamp;

import com.maryanto.dimas.bootcamp.controller.BukuController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * lasdjfkldfjlsdjf
 */
public class BelajarJava {

    public static String functionLain() {
        String namaLengkap = "Dimas Maryanto";
        return namaLengkap;
    }

    public static BigDecimal hitungLagi(BigDecimal saldo, Float pajak) {
        String namaLengkap = "Dimas Maryanto";
        BigDecimal bunga = saldo.multiply(BigDecimal.valueOf(pajak));
        return bunga;
//        return namaLengkap;
    }

    public static void procedureLain() {
        LocalDate sekarang = LocalDate.now();
        LocalDateTime custome = LocalDateTime.of(2022, 03, 24, 9, 30);
        LocalDate tanggalLahir = LocalDate.of(1999, 01, 1);

        System.out.println("sekarang tanggal: " + sekarang.toString());
        System.out.println("sekarang jam: " + custome.toString());
    }

    public static void main(String[] args) {
        BukuController call = new BukuController();
//        call.insert();
//        call.findByMobil();
//        call.findByMotor();
//        call.findByKendaraanMobilAndMotor();
        System.out.println(call.hitungKecepatan());
    }
}
