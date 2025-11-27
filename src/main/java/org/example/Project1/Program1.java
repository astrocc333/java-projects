package org.example.Project1;
/*Create a program that uses an array to store the names of five fruits, and then uses a loop
to print each fruit name on a new line.*/

public class Program1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Strawberry", "Watermelon"};
        for (String fruitNames : fruits) {
            System.out.println(fruitNames);
        }
    }
}
