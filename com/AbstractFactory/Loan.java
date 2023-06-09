package com.AbstractFactory;

abstract class Loan {
    protected double rate;
    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanamount,int years){
        double EMI;
        int n;

        n = years*12;
        rate = rate/1200;

        // This is the montly EMI which will be pay by the person
        EMI = (rate*Math.pow((1+rate),n)) / ((Math.pow((1+rate),n))-1)*loanamount;
        System.out.println("Your monthly EMI is "+EMI+" for the amount "+loanamount+" you have borrowed");
    }
}
