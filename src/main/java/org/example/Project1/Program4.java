package org.example.Project1;
import java.util.Scanner;
/* Write a program that takes two numbers as input and prints their sum, difference, product,
and division without using any extra variables for calculations.*/
public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Sum: "+(num1+num2) );
        System.out.println("Difference: "+(num1-num2) );
        System.out.println("Product: "+(num1*num2) );
        System.out.println("Division: "+(num1/num2) );

    }
}
