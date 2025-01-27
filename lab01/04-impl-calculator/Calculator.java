class Calculator {
    int nOpDone;
    double lastRes;

    void build() {
        nOpDone = 0;
        lastRes = 0;
    }

    double add(final double n1, final double n2) {
        return calc(n1 + n2);
    }

    double sub(final double n1, final double n2) {
        return calc(n1 - n2);
    }

    double mul(final double n1, final double n2) {
        return calc(n1 * n2);
    }

    double div(final double n1, final double n2) {
        return calc(n1 / n2);
    }

    double calc(final double result) {
        lastRes = result;
        nOpDone++;
        return lastRes;
    }
}
