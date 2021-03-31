package services;

import models.User;

public interface PrincipalRoles {
    boolean queryTeacher(String offence, User principal, User teacher);
    boolean expelStudent(String offence, User principal, User student);
    boolean admitApplicant(int age, User principal, User applicant);
}
