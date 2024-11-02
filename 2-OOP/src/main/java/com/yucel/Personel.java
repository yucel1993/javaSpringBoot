package com.yucel;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Personel {
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String departmani;
    private int sicilNo;
    private String tahsilDurumu;
    private String adres;
    private float maasi;
    private boolean medeniDurumu;
}