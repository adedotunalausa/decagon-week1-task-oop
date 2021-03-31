package services.implementation;

import models.Course;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeacherRolesImplementationTest {
    private Course course;
    private User teacher;
    private User principal;
    private TeacherRolesImplementation teacherRolesImplementation;

    @BeforeEach
    public void setUp() {

        principal = new User("0014PRI", "Isaiah", "Ose",
                "728u63ed#$", 39, "ade@gmail.com","08046374728",
                "2 irewolu street", "Lagos", "Lagos", "nonAcademic",
                "principal","male", "nigerian");

        teacher = new User("0014PRI", "Daro", "Champion",
                "98239hjsdf#", 59, "daro@gmail.com","08046374728",
                "35 agbaje street", "Ibadan", "Oyo", "academic",
                "teacher","male", "nigerian", "professor",
                "mechatronics", "engineering");

        course = new Course("Introduction to mechanics", "MEE201",
                4, teacher);

        teacherRolesImplementation = new TeacherRolesImplementation();
    }

    @Test
    void teachCourse() {
        boolean actual1 = teacherRolesImplementation.teachCourse(course, teacher);
        boolean actual2 = teacherRolesImplementation.teachCourse(course, principal);

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, actual1),
                () -> Assertions.assertEquals(false, actual2)
        );
    }
}
