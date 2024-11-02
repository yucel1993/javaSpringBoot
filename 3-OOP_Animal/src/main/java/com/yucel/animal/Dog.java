package com.yucel.animal;

import com.yucel.base.Animal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class Dog extends Animal {


    @Override
    protected void giveVoice(){
        System.out.println("Dog: Havvvvvv");
    }
    @Override
    public void moveOut(){
        System.out.println("Cat: Dog is running fast");
    }
}
