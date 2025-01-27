# PHASE 1 - Constructors

1. Observe and then remove the `void main(String[])` and `void build(...)` methods from the `Student` class.
    - Note how, between the instantiation of a `Student` and its "construction" using `build`, the object is in a semantically inconsistent state.
2. Implement a no-argument constructor for `Train`.
    - The fields should be initialized with default *reasonable* values of your choice.
3. Implement a constructor with a minimal set of parameters to initialize an instance of the class.
4. Independently implement the constructor for the `Student` class.
5. Follow the instructions in `UseConstructors`.
6. Referring to the lesson discussion about calling existing constructors in the body of another constructor using the `this` statement, modify the no-argument constructor of `Train` to reuse the one that accepts parameters for initialization.
7. Create (if not already done) a `Train(int, int)` constructor where the arguments passed are the first-class and second-class seats, respectively.
8. Follow the instructions in `UseConstructorsEvolved` to run the test.

# PHASE 2 - More Advanced Exercise

1. Complete the `Smartphone` class with the following constructors:
    - `Smartphone(String brand, String model)`
    - `Smartphone(String brand, String model, boolean hasGPS, boolean has3g)`
    - `Smartphone(String brand, String model, int sdSize)`
    - `Smartphone(String brand, String model, boolean hasNFC)`
    - Constructor with one argument for each field (NOTE: be sure to use `this` to call existing constructors).
2. Use the comments in the `main` method of the class to write a test and execute it.
