package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {

    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(final AccountHolder holder, final double amount) {
        super(holder, amount);
    }

    @Override
    protected boolean isWithdrawAllowed(final double amount) {
        return this.getBalance() >= amount;
    }

    @Override
    protected double computeFees() {
        return MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
    }

}
