package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public void withdraw(int id, double amount) {
        if (this.checkUser(id) && this.balance >= amount) {
            this.op(id, -amount);
        }
    }

    @Override
    public void deposit(int id, double amount) {
        this.op(id, amount);
    }

    @Override
    public void depositFromATM(int id, double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
        this.withdraw(id, -amount + ATM_TRANSACTION_FEE);
    }

    @Override
    public void chargeManagementFees(int id) {
        double fee = MANAGEMENT_FEE + (transactions * TRANSACTION_FEE);
        if (this.checkUser(id) && this.balance >= fee) {
            this.balance -= fee;
            this.transactions = 0;
        }
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    private void op(final int id, final double amount) {
        if (checkUser(id)) {
            this.transactions++;
            this.balance += amount;
        }
    }

    private boolean checkUser(final int id) {
        return this.id == id;
    }
}
