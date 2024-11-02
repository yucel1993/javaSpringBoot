package com.yucel;

public class Wallet {

    private Person owner;  // Reference to a Person
    private short amount;

    public Wallet(Person owner, short amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public Person getOwner() {
        return owner;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "owner=" + owner +  // Calls the Person's toString method
                ", amount=" + amount +
                '}';
    }
}
