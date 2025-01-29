# Train: Implementation of a Class with Related Fields

1. **Implement a Java class** that models the concept of a train, with the following characteristics:
   * **Fields**:
     - `int nTotSeats`: the total number of seats in the train.
     - `int nFirstClassSeats`: the number of first-class seats.
     - `int nSecondClassSeats`: the number of second-class seats.
     - `int nFirstClassReservedSeats`: the number of reserved first-class seats.
     - `int nSecondClassReservedSeats`: the number of reserved second-class seats.
   * **Methods**:
     - `void build(???)`: initializes the fields appropriately. Decide what the correct and smallest possible set of input arguments for this method is.
     - `void reserveFirstClassSeats(int)`: allows reservation of first-class seats.
     - `void reserveSecondClassSeats(int)`: allows reservation of second-class seats.
     - `double getTotOccupancyRatio()`: calculates and returns the overall occupancy ratio as a percentage.
     - `double getFirstClassOccupancyRatio()`: calculates and returns the first-class occupancy ratio as a percentage.
     - `double getSecondClassOccupancyRatio()`: calculates and returns the second-class occupancy ratio as a percentage.
     - `void deleteAllReservations()`: cancels all reservations.
   * **Note**: Ensure proper conversion from `int` to `double` when calculating the occupancy percentages. Be aware that operations between primitive types in Java work similarly to `int` and `double` operations in C (compiled for 64-bit processors). If you have doubts, ask the instructor or tutor.
   
2. **Complete the `UseTrain` class** by following the comments inside it.
3. **Compile and run** the program to verify it works as expected.

---

### Key Points:

- This exercise will help you model a more complex object (the train) and manage its attributes with a few methods. The main challenge will be to calculate the occupancy ratios correctly, using type conversion and percentage calculations.
- Once you complete the `Train` class, you'll also test it using the `UseTrain` class, which will provide sample usage scenarios.
