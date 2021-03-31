import models.Course;
import models.User;
import services.implementation.PrincipalRolesImplementation;
import services.implementation.StudentRolesImplementation;
import services.implementation.TeacherRolesImplementation;

public class Main {

    public static void main(String[] args) {

        User principalIsaiah = new User("0014PRL", "Isaiah", "Ose",
                "728u63ed#$", 39, "ade@gmail.com","08046374728",
                "2 irewolu street", "Lagos", "Lagos", "nonAcademic",
                "principal","male", "nigerian");

        User professorDaro = new User("0011TCH", "Daro", "Champion",
                "98239hjsdf#", 59, "daro@gmail.com","08046374728",
                "35 agbaje street", "Ibadan", "Oyo", "academic",
                "teacher","male", "nigerian", "professor",
                "mechatronics", "engineering");

        User professorJuba = new User("0011TCH", "Juba", "Gambino",
                "iure923892&#", 79, "juba@gmail.com","08046374728",
                "15 tanwa street", "Lagos", "Lagos", "academic",
                "teacher","male", "british", "professor",
                "biology", "pure_and_applied_sciences");

        User applicantDele = new User("0009APL", "Dele", "Power",
                "728u63ed#$", 19,"dele@gmail.com","08046374728",
                "37 Kumayi street", "Akure", "Ondo","applicant",
                "user","male", "nigerian", "0","economics",
                "social_sciences");

        User studentClaro = new User("0004STD", "Claro", "Gift",
                "asjdkf234!", 22,"claro@gmail.com","08046374728",
                "5 igbedan street", "Ilorin", "Kwara","student",
                "student","female", "nigerian", "100",
                "computer_science", "engineering");

        //demonstrating principal roles and privileges.
        PrincipalRolesImplementation principalRolesImplementation =
                new PrincipalRolesImplementation();
        principalRolesImplementation.queryTeacher("Came late to work",
                principalIsaiah, professorDaro);

        //admitting an applicant only done by a principal
        System.out.println("Applicant before admission:" + applicantDele.getUserType());
        principalRolesImplementation.admitApplicant(21, principalIsaiah, applicantDele);
        System.out.println("Applicant after admission:" + applicantDele.getUserType());

        //creating a course
        Course course = new Course("Introduction to mechanics", "MEE201",
                4, professorDaro);

        //demonstrating student roles.
        StudentRolesImplementation studentRolesImplementation = new StudentRolesImplementation();
        System.out.println("Initially enrolled students: ");
        course.getEnrolledStudents();
        studentRolesImplementation.enrollToCourse(course, studentClaro);//enrols student to the course.
        System.out.println("Final enrolled students");
        course.getEnrolledStudents();

        //demonstrating teacher roles.
        TeacherRolesImplementation teacherRolesImplementation = new TeacherRolesImplementation();
        System.out.println("Initial teachers teaching the course: ");
        course.getTeachers();
        teacherRolesImplementation.teachCourse(course, professorJuba);
        System.out.println("Teachers teaching after: ");
        course.getTeachers();

    }
}
