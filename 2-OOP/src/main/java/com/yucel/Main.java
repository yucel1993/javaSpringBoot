package com.yucel;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Mudur mudur = new Mudur();
        mudur.setAdi("Murat");
        mudur.setSoyadi("Özyürek");
        mudur.setMaasi(8_000f);
        mudur.setMakamAraci(true);
        mudur.setTelefonNo("322432432");
        mudur.setSicilNo(123);
        mudur.setDepartmani("Arge");

        mudur.bilgisiniYaz(mudur);
        System.out.println("///////////////////////////*******************");
        System.out.println(mudur);

        System.out.println("----------");


        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Emre");
        muhasebe.setSoyadi("Cananoğlu");
        muhasebe.setMaasi(4_000f);
        muhasebe.setYeminDurumu(true);
        muhasebe.setTelefonNo("2323");
        muhasebe.setSicilNo(999);
        muhasebe.setDepartmani("Finans");

        muhasebe.bilgisiniYaz(muhasebe);
        muhasebe.hesapla((short)123);
        System.out.println("******************");
        System.out.println(muhasebe);

        System.out.println("----------");


        Yazilimci yazilimci = new Yazilimci();
        yazilimci.setAdi("Serdar");
        yazilimci.setSoyadi("Çakır");
        yazilimci.setMaasi(9_000f);
        yazilimci.setUzmanlikAlani("Java");
        yazilimci.setTelefonNo("8888");
        yazilimci.setSicilNo(5555);
        yazilimci.setDepartmani("Arge");
        yazilimci.setTahsilDurumu("Bachelor");
        yazilimci.bilgisiniYaz(yazilimci);
        System.out.println("******************");
        System.out.println(yazilimci);




    }
}