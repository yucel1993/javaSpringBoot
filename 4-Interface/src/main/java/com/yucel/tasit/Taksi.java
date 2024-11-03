package com.yucel.tasit;

import com.yucel.base.Arac;
import com.yucel.kural.IAracKural;
import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Taksi extends Arac implements IAracKural {

    private String owner;
    public Taksi(short koltukSayi, byte tekerSayisi, String marka, int motorHacmi, String yakitTipi, String owner) {
        super(koltukSayi, tekerSayisi, marka, motorHacmi, yakitTipi); // Initialize parent fields
        this.owner = owner; // Initialize Taksi's own field
    }




    @Override
    public Integer hiz(int speed) {
        return speed;
    }

    @Override
    public Boolean register(boolean register) {
        return register;
    }
}
