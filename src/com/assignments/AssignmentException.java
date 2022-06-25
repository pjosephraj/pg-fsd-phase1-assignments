package com.assignments;

import java.util.Scanner;

public class AssignmentException {

    static void validateSalary(int salary) throws SalaryException {
        if(salary < 2100) {
            throw new SalaryException("You need to work hard");
        } else if(salary < 5100) {
            throw new SalaryException("Your salary is somehow good");
        } else if(salary < 9000) {
            throw new SalaryException("Salary is very good");
        } else {
            System.out.println("Salary is very very good");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter your salary: ");
            int salary = sc.nextInt();
            validateSalary(salary);
        } catch (Exception msg) {
            System.out.println("Exception occured: "+ msg.getMessage());
        }
    }
}

class SalaryException extends Exception {
    SalaryException(String msg) {
        super(msg);
    }
}
