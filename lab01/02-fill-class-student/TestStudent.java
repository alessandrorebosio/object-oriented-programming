class TestStudent {

    public static void main(final String[] args) {
        final Student mario = new Student();
        mario.build("Alex", "Balducci", 1015, 2019);
        mario.printStudentInfo();

        final Student simone = new Student();
        simone.build("Angel", "Bianchi", 1016, 2018);
        simone.printStudentInfo();

        final Student andrea = new Student();
        andrea.build("Andrea", "Bracci", 1017, 2017);
        andrea.printStudentInfo();
    }
}
