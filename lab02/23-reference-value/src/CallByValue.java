class CallByValue {

    void increment(int a) {
        a++;
    }

    public static void main(final String[] args) {
        final int x = 1;
        final CallByValue cbv = new CallByValue();
        cbv.increment(x);
        System.out.println("x=" + x);
    }
}
