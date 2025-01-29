package it.unibo.nestedenum;

import java.util.Comparator;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {

    private enum Month {

        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private final int days;

        Month(final int days) {
            this.days = days;
        }

        static Month fromString(final String name) {
            Objects.requireNonNull(name);
            try {
                return valueOf(name);
            } catch (final IllegalArgumentException e) {
                Month found = null;
                for (final Month month : values()) {
                    if (month.toString().toLowerCase().startsWith(name.toLowerCase())) {
                        if (found != null) {
                            throw new IllegalArgumentException("ambiguous");
                        }
                        found = month;
                    }
                }
                if (found == null) {
                    throw new IllegalArgumentException("no match");
                }
                return found;
            }
        }
    }

    @Override
    public Comparator<String> sortByDays() {
        return new SortByDays();
    }

    @Override
    public Comparator<String> sortByOrder() {
        return new SortByMonthOrder();
    }

    private static final class SortByMonthOrder implements Comparator<String> {
        @Override
        public int compare(final String s1, final String s2) {
            return Month.fromString(s1).compareTo(Month.fromString(s2));
        }
    }

    private static final class SortByDays implements Comparator<String> {
        @Override
        public int compare(final String s1, final String s2) {
            return Integer.compare(Month.fromString(s1).days, Month.fromString(s2).days);
        }
    }
}
