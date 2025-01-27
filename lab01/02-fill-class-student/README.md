# Completing a Class by Adding/Implementing Members (Fields, Methods)

Please *do not modify*:

* The method names
* The return type of the methods

## PHASE 1

1. Complete the `Student` class by adding:
   * Fields:
     - `String name`
     - `String surname`
     - `int id` (representing the student’s ID number)
     - `int matriculationYear`
   * Methods:
     - `void build(String, String, int, int)`:
       Initializes the `Student` object with the provided input parameters, which are:
       - the first name,
       - the last name,
       - the ID number, and
       - the matriculation year.
     - `void printStudentInfo()`:
       Prints to standard output the student’s information, i.e.:
       - their full name,
       - the student ID number, and
       - the matriculation year.
2. Compile the `Student` class and verify there are no compilation issues.

## PHASE 2

1. Modify the `main` method of the `TestStudent` class as follows:
   - Create new student objects with the following details:
     - Name: Alex, Surname: Balducci, ID: 1015, Matriculation Year: 2019
     - Name: Angel, Surname: Bianchi, ID: 1016, Matriculation Year: 2018
     - Name: Andrea, Surname: Bracci, ID: 1017, Matriculation Year: 2017
2. Print the information of each student using the appropriate method.
3. Compile the source files and run `TestStudent`.
