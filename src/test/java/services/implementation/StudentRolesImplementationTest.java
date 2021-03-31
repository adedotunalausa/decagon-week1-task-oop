package services.implementation;

import models.Course;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentRolesImplementationTest {

    private Course course;
    private User student;
    private User principal;
    private User teacher;
    private StudentRolesImplementation studentRolesImplementation;

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

        student = new User("0014PRI", "Claro", "Gift",
                "asjdkf234!", 22,"claro@gmail.com","08046374728",
                "5 igbedan street", "Ilorin", "Kwara","student",
                "student","female", "nigerian", "100",
                "computer_science", "engineering");

        course = new Course("Introduction to mechanics", "MEE201",
                4, teacher);

        studentRolesImplementation = new StudentRolesImplementation();
    }

    @Test
    void enrollToCourse() {
        boolean actual1 = studentRolesImplementation.enrollToCourse(course, student);
        boolean actual2 = studentRolesImplementation.enrollToCourse(course, principal);

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, actual1),
                () -> Assertions.assertEquals(false, actual2)
        );
    }
}
