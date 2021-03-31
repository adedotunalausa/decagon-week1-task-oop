package services.implementation;

import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalRoleImplementationTest {

    User principalIsaiah = new User("0014PRI", "Isaiah", "Ose",
            "728u63ed#$", 39, "ade@gmail.com","08046374728",
            "2 irewolu street", "Lagos", "Lagos", "nonAcademic",
            "principal","male", "nigerian");

    User professorDaro = new User("0014PRI", "Daro", "Champion",
            "98239hjsdf#", 59, "daro@gmail.com","08046374728",
            "35 agbaje street", "Ibadan", "Oyo", "academic", "teacher",
            "male", "nigerian", "professor", "mechatronics", "engineering");

    User applicantDele = new User("0014PRI", "Dele", "Power", "728u63ed#$", 19,
            "dele@gmail.com","08046374728", "37 Kumayi street", "Akure", "Ondo",
            "applicant", "user","male", "nigerian");

    User studentClaro = new User("0014PRI", "Claro", "Gift", "asjdkf234!", 22,
            "claro@gmail.com","08046374728", "5 igbedan street", "Ilorin", "Kwara",
            "student", "student","female", "nigerian", "100",
            "computer_science", "engineering");

    PrincipalRolesImplementation principalRolesImplementation = new PrincipalRolesImplementation();

    @Test
    void queryTeacher() {

        boolean expected1 = true;
        boolean actual1 =  principalRolesImplementation.queryTeacher("Late coming",
                principalIsaiah, professorDaro);
        boolean expected2 = false;
        boolean actual2 =  principalRolesImplementation.queryTeacher("Late coming",
                professorDaro, professorDaro);

        Assertions.assertAll(() -> Assertions.assertEquals(expected1, actual1),
                () -> Assertions.assertEquals(expected2,actual2)
        );

    }

    @Test
    void expelStudent() {

        boolean expected1 = true;
        boolean actual1 =  principalRolesImplementation.expelStudent("Fighting",studentClaro);
        boolean expected2 = false;
        boolean actual2 =  principalRolesImplementation.expelStudent("Fighting", applicantDele);

        Assertions.assertAll(() -> Assertions.assertEquals(expected1, actual1),
                () -> Assertions.assertEquals(expected2,actual2)
        );

    }

    @Test
    void admitApplicant() {
        boolean expected1 = true;
        boolean actual1 = principalRolesImplementation.admitApplicant(21, applicantDele);
        boolean expected2 = false;
        boolean actual2 = principalRolesImplementation.admitApplicant(16, applicantDele);

        Assertions.assertAll(() -> Assertions.assertEquals(expected1, actual1),
                () -> Assertions.assertEquals(expected2,actual2)
        );
    }
}
