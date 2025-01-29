package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // 1) Create a train with the default number of seats, as in the previous case
        // (this is to verify the new implementation of Train()).
        final Train t1 = new Train();
        t1.printTrainInfo();

        // 2) Create the following trains using the constructor Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats = 200;
        // - nFCSeats = 35; nSCSeats = 165;
        final Train t2 = new Train(20, 200);
        t2.printTrainInfo();

        final Train t3 = new Train(35, 165);
        t3.printTrainInfo();
    }
}
