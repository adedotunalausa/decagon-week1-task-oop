package services.implementation;

import models.User;
import services.PrincipalRoles;

public class PrincipalRolesImplementation implements PrincipalRoles {

    @Override
    public boolean queryTeacher(String offence, User principal, User teacher) {
        if (principal.getRole().equals("principal")) {
            System.out.println(teacher.getFirstName() + " has been queried and advised to be of good" +
                    " behaviour before grave actions are taken. Offence: " + offence);
            return true;
        } else {
            System.out.println("Sorry 😝!!! You do not have the privileges to perform this action");
            return false;
        }
    }

    @Override
    public boolean expelStudent(String offence, User principal, User student) {
        if (principal.getRole().equals("principal")) {
            if (student.getUserType().equals("student") && student.getRole().equals("student")) {
                System.out.println(student.getFirstName() + " is hereby expelled. Offence: " + offence);
                return true;
            } else {
                System.out.println("Cannot expel a non-student user!");
                return false;
            }
        } else {
            System.out.println("Sorry 😝!!! You do not have the privileges to perform this action");
            return false;
        }

    }

    @Override
    public boolean admitApplicant(int age, User principal, User applicant) {
        if (principal.getRole().equals("principal")) {
            if (age < 18) {
                System.out.println("Applicant too young to be admitted into the school");
                return false;
            } else {
                applicant.setUserType("student");
                applicant.setRole("student");
                applicant.setLevel("100");
                applicant.setDepartment(applicant.getDepartment());
                applicant.setFaculty(applicant.getFaculty());
                System.out.println(applicant.getFirstName() + " has passed all requirements and is " +
                        "hereby admitted into the department of " + applicant.getDepartment());
                return true;
            }
        } else {
            System.out.println("Sorry 😝!!! You do not have the privileges to perform this action");
            return false;
        }
    }

}
