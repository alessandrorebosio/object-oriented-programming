# Construction of Encapsulated Classes and Interfaces

* Complete the `SimpleBankAccount` class following the instructions provided in its comments.

* Test the implementation using the `TestSimpleBankAccount` class.

* Modify the `SimpleBankAccount` class so that it implements the `BankAccount` interface, implementing only the necessary methods to ensure the interface is properly implemented.
    - Note that for `SimpleBankAccount`, there are no management fees. Therefore, the method `chargeManagementFees()` should be defined (as required by the interface), but its body should be empty.

* Implement the `StrictBankAccount` class independently, such that:
    - `StrictBankAccount` implements `BankAccount`
    - Account operations should only be enabled if the user ID matches the one associated with the account.
    - Withdrawals should not be allowed if the specified withdrawal amount exceeds the available balance in the account. If this occurs, the withdrawal operation should do nothing.
    - The management fees should be calculated as follows: in addition to a fixed cost of 5 Euros, a variable cost of 0.1 Euros should be added for each transaction performed.

* Perform the test of `StrictBankAccount` following the instructions provided and the comments in `TestBankAccount`.
