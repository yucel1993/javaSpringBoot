package com.yucel;

public class Main {
    public static void main(String[] args) {

        // Create a Person
        Person person1 = new Person("TestUser", "TestSurname");
        Person person2 = new Person("Burhan", "Yucel");

        // Create Wallets for each person
        Wallet wallet1 = new Wallet(person1, (short) 12000);  // amount cast to short
        Wallet wallet2 = new Wallet(person2, (short) 30);     // amount cast to short

        // Display the Wallets and their associated owners
        System.out.println(wallet1);
        System.out.println(wallet2);
    }
}
