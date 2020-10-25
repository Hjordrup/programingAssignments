package Opgave_9_7;

import java.util.Date;

public class Account {


    // data fields****************************************
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new java.util.Date();

    // constructors *******************************************
    // no-arg constructor
    public Account(){
    }
    // constuctor with arg.
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //getter and setters .********************************************
    //getter for id.
    public int getId() {
        return id;
    }
    // setter for id.
    public void setId(int id) {
        this.id = id;
    }
    // getter for balance.
    public double getBalance() {
        return balance;
    }
    // setter for balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // getter for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    // setter for annualInterestRate.
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // getter for dateCreated.
    public Date getDateCreated(){
        return dateCreated;
    }


   // Methods. ************************************

   public double getMonthlyInterestRate(){
       return (annualInterestRate/12);

   }



   public double getMonthlyInterest(){
        return balance*((annualInterestRate/100)/12);
   }




   public void withdraw(double Amount){
        setBalance(balance-Amount);


   }

   public void deposit(double Amount){
        setBalance(balance+Amount);


   }






}
