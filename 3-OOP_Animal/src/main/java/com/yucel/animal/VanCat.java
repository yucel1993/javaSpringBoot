package com.yucel.animal;

public class VanCat extends Cat{
    public VanCat(){
        super();
        System.out.println("I am Van CAT");
    }

    @Override
    protected void giveVoice(){
        System.out.println("Cat : Miyavv");
    }

    public void vanCatMethodOnly(){
        System.out.println("Cat: Cat is running");
    }
}
