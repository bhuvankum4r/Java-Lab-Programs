// Write a Java program to display fibonacci series using method overloading
// Fibonacci Series using non recursion
package edu.aiml;
import java.util.*;

public class FibonacciSeries_nonRecursion
{
    public static void main(String[] args)
    {
        int terms, last = 1, secondLast = 0, current;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms in Fibonacci Series:\n");
        terms = scanner.nextInt();
        for(int i = 0; i < terms; i++)
        {
            if(i < 2)
            {
                current = i;
            }
            else
            {
                current = last + secondLast;
                secondLast = last;
                last = current;
            }
            System.out.print(current + " ");
        }
    }
}
