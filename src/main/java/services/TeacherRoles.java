package services;

import models.Course;
import models.User;

public interface TeacherRoles {

    boolean teachCourse(Course course, User teacher);

}
