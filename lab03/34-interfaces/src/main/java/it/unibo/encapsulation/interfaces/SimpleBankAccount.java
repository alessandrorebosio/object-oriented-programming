package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {

    /*
     * Add the following fields:
     * - double balance: the amount in the account
     * - int transactions: the number of operations performed
     * - static double ATM_TRANSACTION_FEE = 1: cost of ATM transactions
     */

    private static double ATM_TRANSACTION_FEE = 1;
    private final int id;
    private double balance;
    private int transactions;

    /*
     * Create a public constructor that takes an integer (the user’s id)
     * and a double (the initial balance of the bank account).
     */
    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    /*
     * Add selectors (getters) for:
     * - obtaining the user id of the account holder
     * - obtaining the number of transactions performed
     * - obtaining the current balance of the account.
     */
    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        /*
         * Increments the transaction count and adds the amount to the total balance
         * Note: the deposit succeeds only if the user id matches
         */
        this.op(id, amount);
    }

    public void withdraw(final int id, final double amount) {
        /*
         * Increments the transaction count and subtracts the amount from the total
         * balance.
         * Note: - The account can go into negative balance
         * - The withdrawal succeeds only if the user id matches
         */
        deposit(id, -amount);
    }

    public void depositFromATM(final int id, final double amount) {
        /*
         * Increments the transaction count and adds the amount to the total balance,
         * deducting the fee (constant ATM_TRANSACTION_FEE) for using the ATM (cash
         * machine).
         * Note: the deposit succeeds only if the user id matches
         */
        deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int id, final double amount) {
        /*
         * Increments the transaction count and subtracts the amount plus the fee
         * (constant ATM_TRANSACTION_FEE) for using the ATM (cash machine) from the
         * total balance.
         * Note: - The account can go into negative balance
         * - The withdrawal succeeds only if the user id matches
         */
        depositFromATM(id, amount + ATM_TRANSACTION_FEE);
    }

    public void chargeManagementFees(final int id) {
        /*
         * Reduces the account balance by the amount equal to the management fees
         */
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
