package services.implementation;

import models.Course;
import models.User;
import services.TeacherRoles;

public class TeacherRolesImplementation implements TeacherRoles {

    /**
     * this helps teachers to apply to teach a particular course.
     * @param course this is the course the teacher is going to teach.
     * @param teacher this is the teacher that'll teach the course.
     * @return {boolean}
     */
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
