# Exercise with Arrays

### PHASE 1 - Arrays, the Basics

1. Analyze the method `countOccurencies(int[], int)` in the class `WorkWithArrays`, using the test utility `boolean testCountOccurrencies()`.
2. Compile and run the class.
3. Add a new test to the method `testCountOccurrencies()`.
4. Compile and run it again.
5. Complete the following static methods in the `WorkWithArrays` class:
   - `static int[] evenElements(int[] array)`,  
     which returns an array containing only the elements at *even* positions (indices) of the input array.  
     Example: `evenElems([1, 2, 3, 4]) => [1, 3]`.
   - `static int[] oddElements(int[] array)`,  
     which returns an array containing only the elements at *odd* positions (indices) of the input array.  
     Example: `oddElems([1, 2, 3, 4]) => [2, 4]`.
   - `static int mostRecurringElement(int[] array)`,  
     which returns the element that is repeated the most times within the array.  
     Example:  
     `mostRecurringElement([1, 2, 1, 3, 4]) => 1`,  
     `mostRecurringElement([7, 1, 5, 7, 7, 9]) => 7`.

### PHASE 2 - Sequence Recognizer

1. The class `SeqRecognizer` implements a recognizer for various character sequences.  
   Analyze the first implemented example `boolean checkSeq1(int[] array)`, which recognizes the sequence {1}{2|3},  
   that is, any sequence (even empty) of 1s followed by any sequence (even empty) of 2s or 3s.  
   Problem-solving strategy in natural language:
    1. While I find a sequence of 1s, I continue through the array.
    2. While I find 2s or 3s, I continue through the array.
    3. I check if I have reached the end.
2. Write the method `static boolean checkSeq2(int[] array)`,  
   which recognizes the sequence 1{2}3, i.e., one occurrence of 1,  
   followed by any sequence (even empty) of 2s, followed by a 3.
3. Write the method `static boolean checkSeq3(int[] array)`,  
   which recognizes the sequence 1{2}3{4}[5],  
   i.e., one occurrence of 1, followed by any sequence (even empty) of 2s, followed by a 3,  
   followed by any sequence (even empty) of 4s, followed optionally by a 5.
4. Write the method `static boolean checkSeq4(int[] array)`,  
   which recognizes the sequence [2|3]{4}5.

### PHASE 3 - Reversion and Duplication

Implement the method `static int[] revertUpTo(int[] array, int element)` in `WorkWithArrays`,  
which reverses the elements of `array` from the start up to and including the first occurrence of the element `element`.  
The elements after that occurrence should remain unchanged.  
Example: `revertUpTo([1,2,3,4,5,6,7], 5) => [5, 4, 3, 2, 1, 6, 7]`.

### PHASE 4 - Array of Objects

Complete the class `PlayWithSmartphoneArrays`, which works with the provided `Smartphone` class,  
implementing the following methods that return the number of smartphones matching the user-provided preferences:

1. `static int search(Smartphone[] array, String brand)`
2. `static int search(Smartphone[] array, boolean hasNFC, boolean hasGPS)`
3. `static int search(Smartphone[] array, int nCPUs, int sdSize, boolean has3G)`

### PHASE 5 - Algorithmic Operations on Arrays

1. Implement `static int[] sortArray(int[] array, boolean isDescending)` within `WorkWithArrays`,  
   which sorts the provided array (in ascending/descending order based on the value of the `isDescending` parameter).  
   - You can refer to the bubble sort algorithm.  
   - The use of the library method `Arrays.sort()` is prohibited. :)
2. Implement `static double computeVariance(double[] array)`,  
   which calculates the variance of the elements in the array.

### PHASE 6 - Circular Array

Complete the class `MyCircularArray`, which implements a circular array, containing:
    - A field `int[] array`;
    - Constructor `MyCircularArray(int size)`, which creates a circular array of size `size`;
    - Constructor `MyCircularArray()`, which creates a circular array of 10 elements;
    - Method `void add(int element)`, which adds `element` to the `array` such that,  
    once the array reaches its maximum size, the new values overwrite the previously stored ones;
    - Method `void reset()`, which resets all the elements in the `array` to zero.

*Note*: You are allowed to add fields and methods as needed in order to implement the required functionality.
