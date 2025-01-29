# Composition

* Observe the basic software system for managing university exam sessions. Students can view existing exams, register for them, check their grades for completed exams, and view statistics related to their exams. Professors can create new exam sessions, enter grades for completed exams, and view statistics related to their exams.
* Observe the `User` interface, which defines a generic user of the system, and the `Student` class that implements it.
* Implement the `Professor` class, which implements `User` and models a generic professor.
    - Fields:
        * `int id`
        * `String name`
        * `String surname`
        * `String password` (Note: in reality, passwords should never be stored in plain text)
        * `String[] courses`
    - A single constructor that requires the data necessary to initialize the class.
    - Methods:
        * `public void replaceCourse(String course, int index)`: replaces the course at index `index` with the provided course.
        * `public void replaceAllCourses(String[] courses)`: replaces all the courses taught by the professor.
* Implement the `Exam` class, which models a generic exam session.
    - Fields:
        * `int id`
        * `int maxStudents`
        * `int registeredStudents`
        * `String courseName`
        * `Professor professor`
        * `ExamRoom room` (provided in the source code)
        * `Student[] students`
    - A single constructor that requires the data necessary to initialize the class. Initially, there should be zero registered students.
    - Methods:
        * Appropriate getters for the properties of the exam.
        * `public void registerStudent(Student student)`: registers a student for the exam. If the maximum number of students for the exam has been reached, it does nothing.
        * Implement `toString()` appropriately, using the utility function `Arrays.toString()` to obtain a `String` representation of an array.
    - Note: It’s possible to create the array of students with a fixed size equal to the maximum number of students, and use the number of registered students as an index to know where to register new students.
* Follow the guidelines in `Testing` to test the `Professor` and `Exam` classes.
