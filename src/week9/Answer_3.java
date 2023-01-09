package week9;/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant*/

import java.util.Scanner;

public class Answer_3 {    //Declare Class

    public static void main(String[] args) {   //Declare Main Method or Predefined class
        char ch;
        Scanner scan = new Scanner((System.in));     //Using Scanner Class

        System.out.println("Enter an Alphabet:");
        ch = scan.next().charAt(0);
       //Using If-else conditional statement
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='I' || ch=='O'
         || ch=='U') {
            System.out.println("\nIt is a vowel");
        }else{
        System.out.println("\nIt is a Consonant");}
    }
}
