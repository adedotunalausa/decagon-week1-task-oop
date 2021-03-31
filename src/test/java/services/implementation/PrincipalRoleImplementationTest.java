package services.implementation;

import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrincipalRoleImplementationTest {

    private User principal;
    private User teacher;
    private User student;
    private User applicant;
    private PrincipalRolesImplementation principalRolesImplementation;

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

        applicant = new User("0014PRI", "Dele", "Power",
                "728u63ed#$", 19,"dele@gmail.com","08046374728",
                "37 Kumayi street", "Akure", "Ondo","applicant",
                "user","male", "nigerian", "0","economics",
                "social_sciences");

        principalRolesImplementation = new PrincipalRolesImplementation();
    }

    @Test
    void queryTeacher() {

        boolean conditionTrue1 =  principalRolesImplementation.queryTeacher("Late coming",
                principal, teacher);
        boolean conditionTrue2 =  principalRolesImplementation.queryTeacher("Late coming",
                teacher, teacher);

        Assertions.assertAll(
                () -> Assertions.assertTrue(conditionTrue1),
                () -> Assertions.assertFalse(conditionTrue2)
        );

    }

    @Test
    void expelStudent() {

        boolean conditionTrue1 =  principalRolesImplementation.expelStudent("Fighting",
                principal, student);
        boolean conditionTrue2 =  principalRolesImplementation.expelStudent("Fighting",
                principal, applicant);

        Assertions.assertAll(
                () -> Assertions.assertTrue(conditionTrue1),
                () -> Assertions.assertFalse(conditionTrue2)
        );

    }

    @Test
    void admitApplicant() {

        boolean conditionTrue1 = principalRolesImplementation.admitApplicant(21,
                principal, applicant);
        boolean conditionTrue2 = principalRolesImplementation.admitApplicant(16,
                principal, applicant);

        Assertions.assertAll(
                () -> Assertions.assertTrue(conditionTrue1),
                () -> Assertions.assertFalse(conditionTrue2)
        );
    }
}
