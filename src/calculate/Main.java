package calculate;

import java.util.Scanner;

import static calculate.Calculator.calculateResult;

public class Main {    //Declare Class


    public static void main(String[] args) {   //Declare main method or predefined method
        char c;
     do {
         Scanner sc = new Scanner(System.in);      //Using Scanner class
         System.out.println("Enter the first number");
         int a = sc.nextInt();
         System.out.println("Enter the second number");
         int b = sc.nextInt();
         System.out.print("Please enter one operator (+,-,*,/,%)-");
         char op = sc.next().charAt(0);
         System.out.println("Total");
         calculateResult(a, b, op);


         System.out.println("Would you like to do more calculation?  :y or n:");
         c = sc.next().charAt(0);

     } while (c == 'Y'   ||  c =='y') ;



        }



}
