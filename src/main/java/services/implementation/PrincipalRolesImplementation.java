package services.implementation;

import models.User;
import services.PrincipalRoles;

public class PrincipalRolesImplementation implements PrincipalRoles {

    /**
     * This documents a query against a teacher that has behaved badly.
     * @param offence this is the offence the teacher has committed.
     * @param principal this is the principle who writes the query and he is the only one
     *                  with the right to query a teacher.
     * @param teacher this is the teacher being queried.
     * @return {boolean}
     */
    @Override
    public boolean queryTeacher(String offence, User principal, User teacher) {
        if (principal.getRole().equals("principal")) {
            if (teacher.getRole().equals("teacher") && teacher.getUserType().equals("academic")) {
                System.out.println(teacher.getFirstName() + " has been queried and advised to be of good" +
                        " behaviour before grave actions are taken. Offence: " + offence);
                return true;
            } else {
                System.out.println("Cannot query" + teacher.getFirstName() + "Only a teacher can be queried");
                return false;
            }
        } else {
            System.out.println("Sorry 😝!!! You do not have the privileges to perform this action");
            return false;
        }
    }

    /**
     * this expels a student from the school.
     * @param offence this is the offence committed by the student.
     * @param principal this is the principal expelling the student.
     * @param student this is the student being expelled.
     * @return {boolean}
     */
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

    /**
     *
     * @param age this is the age of the applicant.
     * @param principal this is the principal admitting the student.
     * @param applicant this is the applicant being admitted.
     * @return {boolean}
     */
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
