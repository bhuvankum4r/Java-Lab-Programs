// Write a Java program to display fibonacci series using method overloading
// Fibonacci Series using recursion
package edu.aiml;

import java.util.Scanner;

public class FibonacciSeries_Recursion
{
    public static void main(String[] args)
    {
        int terms, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms:\n");
        terms = scanner.nextInt();
        for(i=0;i<terms;i++)
        {
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num)
    {
        if(num<2)
        {
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
