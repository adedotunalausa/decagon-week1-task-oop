package services;

import models.User;

public interface PrincipalRoles {
    boolean queryTeacher(String offence, User principal, User teacher);
    boolean expelStudent(String offence, User student);
    boolean admitApplicant(int age, User applicant);
}
