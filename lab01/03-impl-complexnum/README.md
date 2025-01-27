# Implementation of Complex Numbers

1. Complete the `ComplexNum` class by adding:
   * Fields:
     - `double re` (real part)
     - `double im` (imaginary part)
   * Methods:
     - `void build(double, double)` (initializes the `ComplexNum` object with the provided input parameters. These are, in order, the real part and the imaginary part).
     - `boolean equal(ComplexNum)` (returns `true` if the passed complex number is equal to the one on which the method is invoked, i.e., `this`).
     - `void add(ComplexNum)` (adds the `ComplexNum` passed as a parameter to the `ComplexNum` on which the method is invoked, i.e., `this`).
     - `String toStringRep()` (returns a textual representation of the number, e.g. `"5.0"`, `"5.2+2.223i"`, `"3.0i"`, `"0.0"`, `"-4.0i"`, `"-4.0-i"`).
2. Follow the instructions in the comments of `TestComplexNum` to implement a test class.
3. Compile and run the program to verify its functionality.
