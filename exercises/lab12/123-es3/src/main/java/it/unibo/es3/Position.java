package it.unibo.es3;

public record Position<X, Y>(X x, Y y) {

    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
}