package services;

import models.User;

public interface PrincipalRoles {
    void queryTeacher(String offence, User teacher);
    void sackTeacher(User teacher);
    void paySalary(int amount, User teacher);
    void expelStudent(String offence, User student);
    void promoteStudent(int score, User student);
    boolean admitApplicant(int age, User applicant);
}
