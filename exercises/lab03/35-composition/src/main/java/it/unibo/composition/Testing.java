package it.unibo.composition;

public class Testing {

    private Testing() {
        /*
         * Prevents the creation of a Testing class from outside.
         */
    }

    public static void main(final String[] args) {

        // 1) Create 3 students of your choice
        final Student aGentile = new Student(1015, "Alex", "Gentile", "1234", 2012);
        final Student fBianchi = new Student(1016, "Fiore", "Bianchi", "mamma", 2010);
        final Student aBracci = new Student(1017, "Andrea", "Bracci", "password", 2012);

        // 2) Create 2 professors of your choice
        final Professor santi = new Professor(2015, "Andrea", "Santi", "mypwd", new String[] { "OOP", "SISOP" });
        final Professor pianini = new Professor(2015, "Danilo", "Pianini", "mypwd2", new String[] { "OOP", "FINFA" });

        // 3) Create two exam rooms, one with 100 seats, the other with 80 seats
        final ExamRoom vela = new ExamRoom(100, "VELA", true, true);
        final ExamRoom gpt1 = new ExamRoom(80, "GPT1", true, true);

        // 4) Create two exams, one with nMaxStudents=10, the other with nMaxStudents=2
        final Exam oop = new Exam(10, 10, santi.getCourses()[0], santi, vela);
        final Exam finfa = new Exam(11, 2, pianini.getCourses()[1], pianini, gpt1);

        // 5) Register all 3 students for the exams
        oop.registerStudent(aGentile);
        oop.registerStudent(fBianchi);
        oop.registerStudent(aBracci);
        finfa.registerStudent(aGentile);
        finfa.registerStudent(fBianchi);
        finfa.registerStudent(aBracci);

        // 6) Print the string representation of the two exams
        System.out.println(oop.toString());
        System.out.println(finfa.toString());
    }
}
