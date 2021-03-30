package services.implementation;

import models.User;
import services.PrincipalRoles;

public class PrincipalRolesImplementation implements PrincipalRoles {
    @Override
    public void queryTeacher(String offence, User teacher) {
        System.out.println(teacher.getFirstName() + " has been queried for " + offence);
    }

    @Override
    public void sackTeacher(User teacher) {

    }

    @Override
    public void paySalary(int amount, User teacher) {

    }

    @Override
    public void expelStudent(String offence, User student) {

    }

    @Override
    public void promoteStudent(int score, User student) {

    }

    @Override
    public boolean admitApplicant(int age, User applicant) {
        if (age < 18) {
            System.out.println("Applicant too young to be admitted into the school");
            return false;
        } else {
            System.out.println(applicant.getFirstName() + " has passed all requirements and is hereby admitted into the school");
            return true;
        }
    }
}
