package com.assignments;

class Employee {
    int salary = 50000;

    class PermEmployee {
        String code = "PE01";
        double hike = .45;

        double new_salary() {
            return salary * this.hike + salary;
        }

        void display() {
            System.out.println("Salary: " + salary);
            System.out.println("Code: " + this.code);
            System.out.println("Hike: " + this.new_salary());
        }

    }

    class TempEmployee {
        String code = "TE01";
        double hike = .35;

        double new_salary() {
            return salary * this.hike + salary;
        }

        void display() {
            System.out.println("Salary: " + salary);
            System.out.println("Code: " + this.code);
            System.out.println("Hike: " + this.new_salary());
        }

    }

    void role() {
        class ContractEmployee {
            String code = "CE01";
            double hike = .30;

            double new_salary() {
                return salary * this.hike + salary;
            }

            void display() {
                System.out.println("Salary: " + salary);
                System.out.println("Code: " + this.code);
                System.out.println("Hike: " + this.new_salary());
            }
        }

        ContractEmployee cEmp = new ContractEmployee();
        cEmp.display();

    }
}

public class InnerClassAssignment1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee.PermEmployee pEmp = emp.new PermEmployee();
        pEmp.display();
        System.out.println("==============================");
        Employee.TempEmployee tEmp = emp.new TempEmployee();
        tEmp.display();
        System.out.println("==============================");
        emp.role();
    }
}
