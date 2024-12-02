package com.binary;

public class BankAccount {
    private int accNumber = 1;
    private double balance = 0;

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance = this.balance - amount;
            System.out.println("You successfully withdrew "+ amount);
            System.out.println("New balance is "+this.balance);
        }
        else{
            System.out.println("Insufficient balance! Available balance = "+ this.balance);
        }
    }
    public void deposite(double amount){

            this.balance = this.balance + amount;
            System.out.println("You successfully deposited "+ amount);
            System.out.println("New balance is "+this.balance);

    }

}
