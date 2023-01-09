package javaprogram;/*Re write the student mark sheet program using if else and while loop.*/

import java.util.Scanner;

public class Answer_2 {
    public static void main(String[] args) {      //Declare main method or Predefined method

        Scanner sc = new Scanner(System.in);      //Using Scanner Class for user input
        System.out.println("             MarkSheet");
        int math,Science,English;
        System.out.println(" Student Name:");
        String name = sc.next();
        System.out.println("Roll No:");
        int no = sc.nextInt();
        System.out.println("Subjects      :    Marks");
        System.out.println("Enter marks in Math ");
        int Math = sc.nextInt();
        System.out.println("Enter marks in Science");
        int Sci = sc.nextInt();
        System.out.println("Enter marks in English");
        int Eng = sc.nextInt();


        float sum = Math+Sci+Eng;
        System.out.println(" Total marks  "+sum);
        int total = 300;

        float per = sum/total*100;
        System.out.println("Percentage"+per);


        if (per >= 35) {                     //Using if else conditional statement
            System.out.println("Result Pass");
        }

        if (per >= 80) {
            System.out.println("Grade A+");
        } else if (per >= 60) {
            System.out.println("Grade A");

        } else if (per >= 50) {
            System.out.println("Grade B");

        } else if (per >= 35) {
            System.out.println("Grade C");

        } else {
            System.out.println("Fail");
        }
        while(per<35){        //Using while loop
            System.out.println("Not Pass");
            break;
        }


    }
}
