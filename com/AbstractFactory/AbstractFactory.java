package com.AbstractFactory;

abstract class AbstractFactory {
    public abstract Bank getBank(String Bank);
    public abstract Loan getLoan(String loan);
}
