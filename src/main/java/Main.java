import models.Course;
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
                "applicant", "user","male", "nigerian", "0",
                "economics", "social_sciences");

        User studentClaro = new User("0014PRI", "Claro", "Gift", "asjdkf234!", 22,
                "claro@gmail.com","08046374728", "5 igbedan street", "Ilorin", "Kwara",
                "student", "student","female", "nigerian", "100",
                "computer_science", "engineering");

        //displaying principal roles and privileges.
        PrincipalRolesImplementation principalRolesImplementation = new PrincipalRolesImplementation();
        principalRolesImplementation.queryTeacher("Came late to work", principalIsaiah, professorDaro);

        //admitting an applicant
        System.out.println("Applicant before admission:" + applicantDele.getUserType());
        principalRolesImplementation.admitApplicant(21, applicantDele);
        System.out.println("Applicant after admission:" + applicantDele.getUserType());

        //creating a course
        Course course = new Course("Introduction to mechanics", "MEE201", 4, professorDaro);
        System.out.println("Initial enrolled students " + course.getEnrolledStudents());
        course.enrollToCourse(studentClaro);
        course.getEnrolledStudents();

    }
}
