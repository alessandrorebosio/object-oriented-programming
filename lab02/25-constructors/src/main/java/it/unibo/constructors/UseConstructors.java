package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {
        // NB: To verify the correctness of the implemented constructors
        // print the information about the students (using the method
        // printStudentInfo) and the trains (for this purpose, implement a
        // method printTrainInfo in the Train class).

        // 1) Create the student Mario Rossi, student number 1014, enrollment year 2013
        final Student marioRossi = new Student(1014, "Mario", "Rossi", 2013);
        marioRossi.printStudentInfo();

        // 2) Create the student Luca Bianchi, student number 1018, enrollment year 2010
        final Student lucaBianchi = new Student(1018, "Luca", "Bianchi", 2010);
        lucaBianchi.printStudentInfo();

        // 3) Create the student Peppino Vitiello, student number 1019, enrollment year 2012
        final Student peppinoVitiello = new Student(1019, "Peppino", "Vitiello", 2012);
        peppinoVitiello.printStudentInfo();

        // 4) Create the student Luca Verdi, student number 1020, enrollment year 2013
        final Student lucaVerdi = new Student(1020, "Luca", "Verdi", 2013);
        lucaVerdi.printStudentInfo();

        // 5) Create a train with 300 seats, 100 in first class and 200 in second class
        final Train t1 = new Train(300, 100, 200);
        t1.printTrainInfo();

        // 6) Create a train with 1200 seats, 50 in first class and 1050 in second class
        final Train t2 = new Train(1200, 50, 1050);
        t2.printTrainInfo();

        // 7) Create a train with 500 seats, all in second class
        final Train t3 = new Train(500, 0, 500);
        t3.printTrainInfo();

        // 8) Create a train with default number of seats
        final Train t4 = new Train();
        t4.printTrainInfo();

        // 9) Verify that the default number of seats is consistent (i.e., the total number of seats is positive,
        // and the sum of first and second class seats matches the total number of seats on the train).
        System.out.println(t4.getTotalSeats() > 0 ? "OK!" : "There is a bug.");
        System.out.println(t4.getTotalSeats() == t4.getFirstClassSeats() + t4.getSecondClassSeats() ? "OK!" : "There is a bug.");
    }
}
