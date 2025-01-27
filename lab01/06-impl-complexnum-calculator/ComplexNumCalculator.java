class ComplexNumCalculator {
    int nOpDone;
    ComplexNumber lastRes;

    void build() {
        nOpDone = 0;
    }

    ComplexNumber add(final ComplexNumber n1, final ComplexNumber n2) {
        final ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re + n2.re, n1.im + n2.im);
        return doOp(returnValue);
    }

    ComplexNumber sub(final ComplexNumber n1, final ComplexNumber n2) {
        final ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re - n2.re, n1.im - n2.im);
        return doOp(returnValue);
    }

    ComplexNumber mul(final ComplexNumber n1, final ComplexNumber n2) {
        final ComplexNumber returnValue = new ComplexNumber();
        returnValue.build(n1.re * n2.re - n1.im * n2.im, n1.im * n2.re + n1.re * n2.im);
        return doOp(returnValue);
    }

    ComplexNumber div(final ComplexNumber n1, final ComplexNumber n2) {
        final ComplexNumber returnValue = new ComplexNumber();
        final double re = (n1.re * n2.re + n1.im * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        final double im = (n1.im * n2.re - n1.re * n2.im) / (n2.re * n2.re + n2.im * n2.im);
        returnValue.build(re, im);
        return doOp(returnValue);
    }

    ComplexNumber doOp(final ComplexNumber result) {
        nOpDone++;
        lastRes = result;
        return lastRes;
    }
}
