package edu;

import java.util.Scanner;

public class Employee
{
    int id;
    String name;
    String desig;
    float salary;
}

class EmpDetails
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees? ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data :\n");

            System.out.print("Enter employee id : ");
            emp[i].id = sc.nextInt();

            System.out.print("Enter employee name :");
            emp[i].name = sc.next();

            System.out.print("Enter employee designation :");
            emp[i].desig = sc.next();

            System.out.print("Enter employee salary :");
            emp[i].salary = sc.nextFloat();

        }
        System.out.println("\n All Employee Details are \n");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Employee id, Name, Designation and Salary :" + emp[i].id + " " + emp[i].name + " " + emp[i].desig + " " +emp[i].salary);
        }
    }
}
