# "From Scratch" Implementation of a Simple Calculator and a Program That Uses It

## PHASE 1

1. **Implement the `Calculator` class**, which will implement a simple calculator capable of working with `double` values. The class should have:
   * **Fields**: None (this class is somewhat "degenerate" in OOP terms).
   * **Methods**:
     - `double add(double, double)`: performs addition.
     - `double sub(double, double)`: performs subtraction.
     - `double mul(double, double)`: performs multiplication.
     - `double div(double, double)`: performs division.
2. **Test the behavior of the class** by following the guidelines provided in the `TestCalculator` class.

## PHASE 2

3. **Modify the `Calculator` class by adding the following**:
   * **Fields**:
     - `int nOpDone`: counts the number of operations performed by the calculator.
     - `double lastRes`: stores the last result computed.
   * **Methods**:
     - `void build()`: initializes both fields to zero.
   * **Modify existing methods**:
     - Update the existing methods so that they appropriately use the two new fields (`nOpDone` and `lastRes`).
4. **Verify the functionality of the new calculator** by modifying `TestCalculator` to print the values of the two new fields after each operation.
