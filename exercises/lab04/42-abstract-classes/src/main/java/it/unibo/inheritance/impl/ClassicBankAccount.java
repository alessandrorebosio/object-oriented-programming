package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(final AccountHolder holder, final double amount) {
        super(holder, amount);
    }

    @Override
    protected boolean isWithdrawAllowed(final double amount) {
        return true;
    }

    @Override
    protected double computeFees() {
        return MANAGEMENT_FEE;
    }

}
