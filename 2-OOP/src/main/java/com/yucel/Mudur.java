package com.yucel;


import lombok.*;
@ToString(callSuper = true)
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor
@Getter
@Setter
public class Mudur extends Personel{

    private  boolean makamAraci;

//    public Mudur() {
//    }
//
//    public Mudur(String adi, String soyadi, String telefonNo,
//                 String departmani, int sicilNo, String tahsilDurumu,
//                 String adres, short maasi, boolean medeniDurumu,
//                 boolean makamAraci) {
//
//        super(adi, soyadi, telefonNo, departmani, sicilNo, tahsilDurumu, adres, maasi, medeniDurumu);
//
//        this.makamAraci = makamAraci;
//
//    }


    public void bilgisiniYaz(Mudur mudur){
        System.out.println(mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println(mudur.getTelefonNo());
        System.out.println(mudur.getDepartmani());
        System.out.println(mudur.getSicilNo());
        System.out.println("Araç: " +  (mudur.isMakamAraci() ? "Var": "Yok") );
    }


}
