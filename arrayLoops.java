package org.example;

public class arrayLoop {
    public static void main(String[] args) {

        int[] number = {10, 12, 16, 18, 20};
        int average =0;

        for(int i =0; i< number.length; i++){
            average += number[i];
            System.out.print(average+" ");
        }

    }
}
