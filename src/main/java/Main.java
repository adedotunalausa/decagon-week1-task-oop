import models.User;
import services.implementation.PrincipalRolesImplementation;

public class Main {

    public static void main(String[] args) {

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

        //displaying principal roles and privileges.
        PrincipalRolesImplementation principalRolesImplementation = new PrincipalRolesImplementation();
        principalRolesImplementation.queryTeacher("Came late to work", principalIsaiah, professorDaro);

    }
}
