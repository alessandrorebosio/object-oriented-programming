package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {

    private final int id;
    private final String name;
    private final String surname;

    private final String password;
    private String[] courses;

    public Professor(
            final int id,
            final String name,
            final String surname,
            final String password,
            final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    @Override
    public String getUsername() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public String[] getCourses() {
        return courses;
    }

    @Override
    public String getDescription() {
        return "Student ["
                + "name=" + this.name
                + ", surname=" + this.surname
                + ", id=" + this.id
                + ", courses=" + this.courses
                + "]";
    }

    public void replaceCourse(final String course, final int index) {
        if (this.courses.length > index) {
            this.courses[index] = course;
        }
    }

    public void replaceAllCourses(final String[] newCourses) {
        this.courses = Arrays.copyOf(newCourses, newCourses.length);
    }

}
