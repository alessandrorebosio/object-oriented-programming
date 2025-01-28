package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount(final AccountHolder holder, final double amount) {
        this.holder = holder;
        this.balance += amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    @Override
    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    @Override
    public final void chargeManagementFees(final int usrID) {
        final double feeAmount = computeFees();
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            balance -= feeAmount;
            this.transactions = 0;
        }
    }

    @Override
    public void deposit(final int id, final double amount) {
        this.op(id, amount);
    }

    @Override
    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    @Override
    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.op(id, -amount);
        }
    }

    @Override
    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    protected abstract boolean isWithdrawAllowed(final double amount);

    protected abstract double computeFees();

    private void op(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.transactions++;
        }
    }

    private boolean checkUser(final int id) {
        return this.holder.getUserID() == id;
    }
}
