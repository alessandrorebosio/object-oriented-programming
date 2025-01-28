package main.java.it.unibo.collections.design.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse {

    private final Set<Product> set = new LinkedHashSet<>();

    @Override
    public void addProduct(final Product p) {
        this.set.add(p);
    }

    @Override
    public Set<String> allNames() {
        final Set<String> s = new LinkedHashSet<>();
        for (final Product p : this.set) {
            s.add(p.getName());
        }
        return s;
    }

    @Override
    public Set<Product> allProducts() {
        final Set<Product> s = new LinkedHashSet<>();
        for (final Product p : this.set) {
            s.add(p);
        }
        return s;
    }

    @Override
    public boolean containsProduct(final Product p) {
        return this.set.contains(p);
    }

    @Override
    public double getQuantity(final String name) {
        for (final Product p : this.set) {
            if (p.getName() == name) {
                return p.getQuantity();
            }
        }
        return -1;
    }

}
