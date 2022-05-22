package org.halim.code.smell.method;

import org.halim.code.smell.model.DepartmentModel;
import org.halim.code.smell.model.UserModel;

public class MethodExtractor {

    /**
     * Problem: You have a code fragment that can be grouped together
     */
    public void print1(UserModel user) {
        System.out.println("user id: " + user.getId());
        System.out.println("user name: " + user.getName());
        System.out.println("department id: " + user.getDepartment().getId());
        System.out.println("department name: " + user.getDepartment().getName());
    }

    /**
     * Solution: Replace the scope in a separated method and let the method call it
     */
    public void print2(UserModel user) {
        printUserDetails(user);
        printDepartmentDetails(user.getDepartment());
    }

    private void printUserDetails(UserModel user) {
        System.out.println("user id: " + user.getId());
        System.out.println("user name: " + user.getName());
    }

    private void printDepartmentDetails(DepartmentModel department) {
        System.out.println("department id: " + department.getId());
        System.out.println("department name: " + department.getName());
    }

}
