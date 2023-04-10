package com.AbstractFactory;

public class FactoryCreator {
    public static AbstractFactory geFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
        return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
        return new LoanFactory();
    }
    return null;
  }
}
