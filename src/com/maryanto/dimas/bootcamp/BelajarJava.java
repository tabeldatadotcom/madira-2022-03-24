package com.maryanto.dimas.bootcamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BelajarJava {

    public static void main(String[] args) {
//        bilangan integer
        int i = 5;
        Integer index = 5;
/*
ini adalah tipe data long
alskdfjdskljsfdf
 */
        Long latitute = 100_000_000l;

        BigDecimal saldo = new BigDecimal(5000);

        char huruf = 'A';
        String kalimat = "Halo saya dengan belajar java!";

        LocalDate sekarang = LocalDate.now();
        LocalDateTime custome = LocalDateTime.of(2022, 03, 24, 9, 30);

        System.out.println(kalimat);
        System.out.println("sekarang tanggal: " + sekarang.toString());

        System.out.println("sekarang jam: " + custome.toString());
    }
}
