package com.yucel;

import com.yucel.animal.Cat;
import com.yucel.base.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal1= new Cat();
        System.out.println(animal1);
        animal1.moveOut();




    }
}