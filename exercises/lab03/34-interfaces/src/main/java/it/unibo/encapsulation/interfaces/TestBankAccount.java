package it.unibo.encapsulation.interfaces;

public class TestBankAccount {
    private static final int INTIAL_AMOUNT = 10000;
    private static final int WITHDRAW_AMOUNT = 15000;
    private static final String ACCOUNT = "'s account balance is ";

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Create the AccountHolder for Andrea Rossi with id 1
         */
        final AccountHolder aRossi = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Create the AccountHolder for Alex Bianchi with id 2
         */
        final AccountHolder aBianchi = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * 3) Declare two BankAccount variables and initialize them,
         * respectively, with objects of type SimpleBankAccount for Rossi's account
         * (initial amount = 0),
         * and of type StrictBankAccount for Bianchi's account (initial amount = 0)
         */
        final BankAccount rossisAccount = new SimpleBankAccount(aRossi.getUserID(), 0);
        final BankAccount bianchisAccount = new StrictBankAccount(aBianchi.getUserID(), 0);
        /*
         * 4) First reflection: why was it possible to create new instances of two
         * different classes in variables of the same type?
         * 
         * Because both implement the same interface!
         */
        /*
         * 5) Deposit €10000 into both accounts
         */
        rossisAccount.deposit(aRossi.getUserID(), INTIAL_AMOUNT);
        bianchisAccount.deposit(aBianchi.getUserID(), INTIAL_AMOUNT);
        /*
         * 6) Withdraw €15000 from both accounts
         */
        rossisAccount.withdraw(aRossi.getUserID(), WITHDRAW_AMOUNT);
        bianchisAccount.withdraw(aBianchi.getUserID(), WITHDRAW_AMOUNT);
        /*
         * 7) Print the current balance
         */
        System.out.println(aRossi.getName() + " " + aRossi.getSurname() + ACCOUNT + rossisAccount.getBalance());
        System.out.println(aBianchi.getName() + " " + aBianchi.getSurname() + ACCOUNT + bianchisAccount.getBalance());
        /*
         * 8) What is the result and why?
         * 
         * Rossi's account balance goes negative, but Bianchi's account doesn't
         * because it doesn't allow going into overdraft.
         */
        /*
         * 9) Deposit €10000 again into both accounts
         */
        rossisAccount.deposit(aRossi.getUserID(), INTIAL_AMOUNT);
        bianchisAccount.deposit(aBianchi.getUserID(), INTIAL_AMOUNT);
        /*
         * 10) Call the computeManagementFees method on both accounts
         */
        rossisAccount.chargeManagementFees(aRossi.getUserID());
        bianchisAccount.chargeManagementFees(aBianchi.getUserID());
        /*
         * 11) Print the current balance again
         */
        System.out.println(aRossi.getName() + " " + aRossi.getSurname() + ACCOUNT + rossisAccount.getBalance());
        System.out.println(aBianchi.getName() + " " + aBianchi.getSurname() + ACCOUNT + bianchisAccount.getBalance());
        /*
         * 12) What is the result and why?
         * 
         * Since no fees have been deducted from Rossi's account, his balance is now
         * negative. On the other hand, Bianchi has almost €20000 because the
         * management fees were not deducted yet.
         */
    }
}
