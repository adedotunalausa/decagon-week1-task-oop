package models;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String password;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String userType; //student, academicStaff, nonAcademicStaff.
    private String role;
    private String gender;
    private String nationality;
    private String level;
    private String department;
    private String faculty;

    //non-academic staff constructor
    public User(String id, String firstName, String lastName, String password,
                int age, String email, String phone, String address, String city,
                String state, String userType, String role, String gender, String nationality) {

        this(id, firstName, lastName, password, age, email, phone, address, city,
                state, userType, role, gender, nationality, null, null, null);

    }

    /**
     * Constructor for creating new user, other constructors inherits from this main constructor.
     * for academic staff, students applicants.
     *
     * @param id a unique identifier, peculiar to individual user.
     * @param firstName First name of the user
     * @param lastName Last name or surname of the user
     * @param password password of the user
     * @param age age of the user
     * @param email email of the user
     * @param phone phone of the user
     * @param address address of the user
     * @param city city of the user
     * @param state state of the user
     * @param userType userType of the user which could be "applicant", "student", "academic" or "nonAcademic".
     *                 New applicants will have "applicant" usertype by default and it will automatically
     *                 change to "student" upon admission.
     * @param role role of the user which could be "principal", "teacher", "student" or user. This field is not
     *             applicable to "student" and "applicant" usertype
     * @param gender gender of the user
     * @param nationality nationality of the user
     * @param level academic level of the user. This is only applicable to students and applicants. it is 0
     *              by default for applicants
     * @param department department of the user. This is only applicable to "applicant", "student" and "academic
     *                   staff" usertype. For applicants, it is the desired department.
     * @param faculty faculty of the user. This is only applicable to "applicant", "student" and "academic"
     *                usertype. For applicants it is the desired faculty
     */
    public User(String id, String firstName, String lastName, String password,
                int age, String email, String phone, String address, String city,
                String state, String userType, String role, String gender, String nationality,
                String level, String department, String faculty) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.userType = userType;
        this.role = role;
        this.gender = gender;
        this.nationality = nationality;
        this.level = level;
        this.department = department;
        this.faculty = faculty;

    }

//    public void expelStudent(User principal) {
//        System.out.println(principal.firstName + " is expelling a student");
//    }


    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserType() {
        return userType;
    }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public String getLevel() {
        return level;
    }

    public String getDepartment() {
        return department;
    }

    public String getFaculty() {
        return faculty;
    }
}
