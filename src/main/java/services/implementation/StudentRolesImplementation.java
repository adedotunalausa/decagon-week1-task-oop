package services.implementation;

import models.Course;
import models.User;
import services.StudentRoles;

public class StudentRolesImplementation implements StudentRoles {

    /**
     * this helps students to enroll to a course (i.e take the course).
     * @param course the course the student is enrolling to.
     * @param student the student enrolling to a course.
     * @return {boolean}
     */
    @Override
    public boolean enrollToCourse(Course course, User student) {
        if (student.getUserType().equals("student")) {
            course.setEnrolledStudent(student);
            System.out.println(student.getFirstName() + " has successfully enrolled to the course.");
            return true;
        } else {
            System.out.println("Sorry!!! Only students can enroll to courses.");
            return false;
        }
    }
}
