package main.java.it.unibo.collections.design.impl;

import it.unibo.collections.design.api.Product;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

    public ComparableProduct(final String name, final int quantity) {
        super(name, quantity);
    }

    @Override
    public int compareTo(final Product o) {
        return getName().compareTo(o.getName());
    }

}
