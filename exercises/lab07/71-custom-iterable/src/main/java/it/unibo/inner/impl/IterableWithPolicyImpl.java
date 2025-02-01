package it.unibo.inner.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final T[] array;
    private Predicate<T> predicate;
    private int index;

    public IterableWithPolicyImpl(final T[] array, final Predicate<T> predicate) {
        this.array = array;
        this.predicate = predicate;
    }

    public IterableWithPolicyImpl(final T[] array) {
        this(array, new Predicate<T>() {
            @Override
            public boolean test(final T elem) {
                return true;
            }
        });
    }

    /*
     * change with IteratorWithoutPolicy, if you want to test
     * TestIterablePlain.java,
     * or use IteratorWithoPolicy for TestIterableWithPolicy
     */
    @Override
    public Iterator<T> iterator() {
        return new IteratorWithoutPolicy();
    }

    @Override
    public void setIterationPolicy(final Predicate<T> filter) {
        this.predicate = filter;
    }

    private class IteratorWithoutPolicy implements Iterator<T> {

        @Override
        public boolean hasNext() {
            if (index < array.length) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array[index++];
            }
            throw new NoSuchElementException();
        }

    }

    @SuppressWarnings("unused")
    private class IteratorWithoPolicy implements Iterator<T> {

        @Override
        public boolean hasNext() {
            while (index < array.length) {
                final T elem = array[index];
                if (predicate.test(elem)) {
                    return true;
                }
                index++;
            }
            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array[index++];
            }
            throw new NoSuchElementException();
        }

    }

}
