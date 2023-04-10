package com.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = br.readLine();

        System.out.println();
         System.out.print("Enter the type of loan e.g. home loan or business loan or Education loan: ");
         String loanName = br.readLine();

         AbstractFactory bankFactory = FactoryCreator.geFactory("Bank");
         Bank b = bankFactory.getBank(bankName);

         System.out.println();

         System.out.println("Enter the interest rate for "+b.getBankName()+": ");
         double rate = Double.parseDouble(br.readLine());

         System.out.println();

         System.out.println("Enter the loan amount you want to take: ");

         double loanamount = Double.parseDouble(br.readLine());
         System.out.println();

         System.out.println("Enter the number of years to pay your entire loan amount: ");
         int years = Integer.parseInt(br.readLine());
         System.out.println();

         System.out.println("You are taking the loan from "+b.getBankName());

         AbstractFactory loanFactory = FactoryCreator.geFactory("Loan");
         Loan l = loanFactory.getLoan(loanName);
         l.getInterestRate(rate);
         l.calculateLoanPayment(loanamount, years);

    }
}
