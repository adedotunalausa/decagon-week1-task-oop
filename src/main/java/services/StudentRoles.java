package services;

import models.Course;
import models.User;

public interface StudentRoles {

    boolean enrollToCourse(Course course, User student);

}
