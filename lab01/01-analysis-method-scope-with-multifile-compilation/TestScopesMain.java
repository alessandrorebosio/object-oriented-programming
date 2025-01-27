class TestScopesMain {
    public static void main(final String[] argv) {
        final Scopes testObj = new Scopes();
        testObj.build(1, 2);
        testObj.dummyMethod(3);
        testObj.dummyMethod2(4);
    }
}
