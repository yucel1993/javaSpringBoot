package com.yucel.base;

public class Animal {
    private String name;
    private String surname;
    private int age;
    public Animal() {
        System.out.println("Base Animal");
    }
    protected void giveVoice(){
        System.out.println("vvrrrrrrrr");
    }
    public void moveOut(){
        System.out.println("animal moves out");
    }
    protected void onlyAnimal(){
        System.out.println("Only from animal");
    }
}
