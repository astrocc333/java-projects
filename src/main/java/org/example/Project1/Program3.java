package org.example.Project1;
/* Create an array to store the scores of six students in a class. Use a loop to count and print
how many scores are above 80*/
public class Program3 {
    public static void main(String[] args) {
int[] scores ={89,78,85,80,90,55};
int count =0;
for(int i=0;i<scores.length;i++){
    if(scores[i]>80){
        count++;
    }
}
        System.out.println("No of scores above 80: " +count);
    }
}
