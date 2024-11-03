package com.yucel;

import com.yucel.base.Arac;
import com.yucel.tasit.Taksi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("*******************");


        Arac myCar;
        myCar=new Taksi((short) 5, (byte) 4,"BMW",3000,"Diesel","Second Hand");
        ((Taksi) myCar).setOwner("BURHAN");
        String myOwner =((Taksi) myCar).getOwner();
        System.out.println(myOwner);
        System.out.println("**************");
        System.out.println(myCar);
        System.out.println("**************");
        Taksi myTaxi= new Taksi((short) 5, (byte) 4,"BMW",3000,"Diesel","Second Hand");
        System.out.println(myTaxi);

        myTaxi.hiz(200);
        myTaxi.register(true);
        if(myTaxi.register(false) && myTaxi.hiz(200) <210)
            System.out.println("Everything is fine");
        else
            System.out.println("No not fine");
    }
}