class UseTrain {
    public static void main(final String[] args) {
        /*
         * 1) Create an object of the Train class
         */
        final Train train = new Train();
        train.build(50, 100);

        /*
         * 2) Make reservations for first and second class
         * specifying a reasonable number of seats to reserve
         */
        train.reserveFirstClassSeats(10);
        train.reserveSecondClassSeats(30);

        /*
         * 3) After each reservation, print the occupancy ratio
         * for the total train and for each class.
         */
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio() + "%");
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio() + "%");
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio() + "%\n");

        /*
         * 4) Cancel all reservations
         */
        train.deleteAllReservations();
        System.out.println("Cleared all reservations.\n");

        /*
         * 5) Make new reservations and print the updated occupancy percentages
         */
        train.reserveFirstClassSeats(25);
        train.reserveSecondClassSeats(100);
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio() + "%");
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio() + "%");
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio() + "%\n");
    }
}
