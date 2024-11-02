package com.yucel.animal;

import com.yucel.base.Animal;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{}";
    }

    public Cat(){
        super();
        System.out.println("Cat");
    }

    @Override
    protected void giveVoice(){
        System.out.println("Cat : Miyavv");
    }
    @Override
    public void moveOut(){
        System.out.println("Cat: Cat is running");
    }
}
