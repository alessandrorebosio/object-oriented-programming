class ComplexNum {
    double re;
    double im;

    void build(final double re, final double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(final ComplexNum num) {
        return (re == num.re) && (im == num.im);
    }

    void add(final ComplexNum num) {
        re += num.re;
        im += num.im;
    }

    String toStringRep() {
        return im == 0
                // Special case: real number.
                ? re + ""
                // Stringify real part if present
                : (re == 0 ? "" : re)
                        // Add + signum if required (if negative, - is added automatically)
                        + (re != 0 && im > 0 ? "+" : "")
                        // Add imaginary part, handle +-1
                        + (im == 1 ? "" : (im == -1 ? "-" : im + "")) + "i";
    }
}
