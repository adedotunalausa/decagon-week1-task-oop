package models;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private int units;
    private ArrayList<User> teachers = new ArrayList<>();
    private ArrayList<User> enrolledStudents = new ArrayList<>();

    public Course(String name, String code, int units, User teacher) {
        this.name = name;
        this.code = code;
        this.units = units;
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

    public ArrayList<User> getTeachers() {
        for (User item: teachers) {
            System.out.println(item.getFirstName());
        }
        return teachers;
    }

    public ArrayList<User> getEnrolledStudents() {
        for (User item: enrolledStudents) {
            System.out.println(item.getFirstName());
        }
        return enrolledStudents;
    }

    public boolean enrollToCourse(User student) {
        if (student.getUserType().equals("student")) {
            enrolledStudents.add(student);
            System.out.println(student.getFirstName() + " has successfully enrolled to the course.");
            return true;
        } else {
            System.out.println("Sorry!!! Only students can enroll to courses.");
            return false;
        }
    }

    public boolean teachCourse(User teacher) {
        if (teacher.getUserType().equals("teacher")) {
            teachers.add(teacher);
            System.out.println(teacher.getFirstName() + " is now teaching the course");
            return true;
        } else {
            System.out.println("Sorry!!! Only a teacher can teach a course.");
            return false;
        }
    }
}
