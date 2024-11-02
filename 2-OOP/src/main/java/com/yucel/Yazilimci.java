package com.yucel;
import lombok.*;

@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Yazilimci extends Personel {

    private String uzmanlikAlani;

    public void bilgisiniYaz(Yazilimci yazilimci) {
        System.out.println(yazilimci.getAdi() + " " + yazilimci.getSoyadi());
        System.out.println(yazilimci.getTelefonNo());
        System.out.println(yazilimci.getDepartmani());
        System.out.println(yazilimci.getSicilNo());
        System.out.println("Araç: " + (yazilimci.isMedeniDurumu() ? "Var" : "Yok"));
    }

}

