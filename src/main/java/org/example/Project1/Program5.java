package org.example.Project1;
/*Write a program that declares two integer variables with values, and then swaps them using
a temporary variable. Print the values before and after the swap.
*/

public class Program5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("The values of num1 and num2 before swap:" + num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The values of num1 and num2 after swap:" + num1 + " " + num2);


    }
}
