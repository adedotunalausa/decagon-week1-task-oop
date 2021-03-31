package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseTest {

    User principalIsaiah = new User("0014PRI", "Isaiah", "Ose",
            "728u63ed#$", 39, "ade@gmail.com","08046374728",
            "2 irewolu street", "Lagos", "Lagos", "nonAcademic",
            "principal","male", "nigerian");

    User professorDaro = new User("0014PRI", "Daro", "Champion",
            "98239hjsdf#", 59, "daro@gmail.com","08046374728",
            "35 agbaje street", "Ibadan", "Oyo", "academic",
            "teacher","male", "nigerian", "professor",
            "mechatronics", "engineering");

    User studentClaro = new User("0014PRI", "Claro", "Gift",
            "asjdkf234!", 22,"claro@gmail.com","08046374728",
            "5 igbedan street", "Ilorin", "Kwara","student",
            "student","female", "nigerian", "100",
            "computer_science", "engineering");

    Course course = new Course("Introduction to mechanics", "MEE201",
            4, professorDaro);

    @Test
    void enrollToCourse() {
        boolean actual1 = course.enrollToCourse(studentClaro);
        boolean actual2 = course.enrollToCourse(principalIsaiah);

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, actual1),
                () -> Assertions.assertEquals(false, actual2)
        );
    }

    @Test
    void teachCourse() {
        boolean actual1 = course.teachCourse(professorDaro);
        boolean actual2 = course.teachCourse(principalIsaiah);

        Assertions.assertAll(
                () -> Assertions.assertEquals(true, actual1),
                () -> Assertions.assertEquals(false, actual2)
        );
    }
}
