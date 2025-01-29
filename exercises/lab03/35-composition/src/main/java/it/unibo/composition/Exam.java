package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;

    private final ExamRoom room;
    private final Student[] students;

    public Exam(final int id, final int nMaxStudents, final String courseName, final Professor professor,
            final ExamRoom room) {
        this.id = id;
        this.maxStudents = nMaxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public int getId() {
        return id;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getRegisteredStudents() {
        return registeredStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ExamRoom getRoom() {
        return room;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(this.students, this.students.length);
    }

    public void registerStudent(final Student student) {
        this.students[this.registeredStudents++] = student;
    }

    public String toString() {
        return "Exam ["
                + "id=" + this.id
                + ", maxStudents=" + this.maxStudents
                + ", registeredStudentsCount=" + this.registeredStudents
                + ", courseName=" + this.courseName
                + ", students=" + Arrays.toString(this.students)
                + ", professor=" + this.professor
                + ", room=" + this.room.toString()
                + "]";
    }
}
