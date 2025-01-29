package it.unibo.arrays;

class MyCircularArray {

    final private static int DEFAULT_LENGHT = 10;

    public static void main(final String[] args) {

        // 1) Create a circular array with ten elements
        MyCircularArray circularArray = new MyCircularArray(10);

        // 2) Add elements from 1 to 10 and print the contents of the circular array
        for (int i = 0; i < 10; i++) {
            circularArray.add(i);
        }
        circularArray.printArray();
        System.out.println();

        // 3) Add elements from 11 to 15 and print the contents of the circular array
        for (int i = 11; i <= 15; i++) {
            circularArray.add(i);
        }
        circularArray.printArray();
        System.out.println();

        // 4) Invoke the reset method
        circularArray.reset();

        // 5) Print the contents of the circular array
        circularArray.printArray();
        System.out.println();

        // 6) Add other elements as desired and print the contents of the circular array
        circularArray.add(1);
        circularArray.add(2);
        circularArray.add(3);
        circularArray.printArray();
    }

    int[] array;

    int index;

    MyCircularArray() {
        new MyCircularArray(DEFAULT_LENGHT);
    }

    MyCircularArray(final int size) {
        this.array = new int[size];
    }

    void add(final int elem) {
        this.array[(this.index++ % array.length)] = elem;
    }

    void reset() {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = 0;
        }
        this.index = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]\n");
    }
}
