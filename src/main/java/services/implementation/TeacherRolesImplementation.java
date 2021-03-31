package services.implementation;

import models.Course;
import models.User;
import services.TeacherRoles;

public class TeacherRolesImplementation implements TeacherRoles {

    @Override
    public boolean teachCourse(Course course, User teacher) {
        if (teacher.getRole().equals("teacher")) {
            course.setTeacher(teacher);
            System.out.println(teacher.getFirstName() + " is now teaching the course");
            return true;
        } else {
            System.out.println("Sorry!!! Only a teacher can teach a course.");
            return false;
        }
    }

}
