# Anonymous Classes, Nested Classes, Enumerations

**Make sure to correct each part of the exercise, not just at the end of all the parts.**

## Part 1: Anonymous Class

Observe the `Function` class, which models a single function with one input and one output of arbitrary type.
Implement the `identity()` method, which must return the identity function 
(i.e., one that returns the input passed without any modification)
using an anonymous class.
Look at `TestFunctionalLibrary` to find examples of anonymous classes that implement functions.
Be prepared to answer the following question during the review:
> Why is `identity()` a method, and not a `public static` constant?

## Part 2: Using Anonymous Classes to Build a Functional Library

Implement the utility functions that are not yet implemented within `Transformers`.
These functions represent *functional* manipulations of collections.
Read the Javadoc comments carefully to find the most compact solution for implementing the requested functions.
Minimize code duplication and avoid using helper methods.

## Part 3: Nested Classes and Enums

Inside the `MonthSorterNested` class, create an `enum Month` that models the months of the year.
It’s suggested to consider using a field to model the number of days in the month.
This enum *must* have a method `Month fromString(String)` that, given a text string, returns the `Month`
that best represents it. In this regard, carefully read the Javadoc of `MonthSorter`.

Use this `enum` to assist in creating two nested classes: `SortByMonthOrder` and `SortByDate`
that implement `Comparator<String>` and represent, respectively, a comparator that sorts strings
(interpreted as months) based on their order in the year, and a comparator that sorts them based on the number
of days in the month.
