package it.unibo.collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *             ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Set<String> tree = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers
         * ranging from "1" to
         * "20" (both included)
         */
        for (int i = 0; i < ELEMS; i++) {
            tree.add(i + "");
        }
        /*
         * 3) Prints its content
         */
        System.err.println(tree);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        var iter = tree.iterator();
        while (iter.hasNext()) {
            if (Integer.parseInt(iter.next()) % 3 == 0) {
                iter.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        System.err.println(tree);
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean even = true;
        iter = tree.iterator();
        while (iter.hasNext()) {
            if (Integer.parseInt(iter.next()) % 2 == 0) {
                even = false;
            }
        }
        System.err.println("All element's even: " + even);
    }
}
