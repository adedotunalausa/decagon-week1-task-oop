package models;

import java.util.ArrayList;

public class Course {
    private final String name;
    private final String code;
    private final int units;
    private ArrayList<User> teachers = new ArrayList<>();
    private ArrayList<User> enrolledStudents = new ArrayList<>();

    public Course(String name, String code, int units, User teacher) {
        this.name = name;
        this.code = code;
        this.units = units;
        this.teachers.add(teacher);

    }

    public void setEnrolledStudent(User enrolledStudent) {
        this.enrolledStudents.add(enrolledStudent);
    }

    public void setTeacher(User teacher) {
        this.teachers.add(teacher);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getUnits() {
        return units;
    }

    public void getTeachers() {
        for(User teacher: teachers) {
            System.out.println(teacher.getFirstName());
        }
    }

    public void getEnrolledStudents() {
        for (User student: enrolledStudents) {
            System.out.println(student.getFirstName());
        }
    }

}
