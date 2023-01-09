package week9;/*-Read the numbers from the console entered by the user and print the
minimumand maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {   //Declare Class

    public static void main(String[] args) {   //Declare Main method or Predefined method

        int min = 0;
        int max= 0;
        int count = 0;
        boolean first = true;

        Scanner minimunMaximumInput= new Scanner(System.in);
        while(true){             //Using while loop

             System.out.println("Enter a number: ");
            boolean hashNextInt =minimunMaximumInput.hasNextInt();
            count += 1;
            if(hashNextInt) {

                int storedNumber =minimunMaximumInput.nextInt();

                if(first) {
                    first = false;
                    min = storedNumber;
                    max = storedNumber;
                }
                if(storedNumber > max) {
                    max = storedNumber;
                }
                if(storedNumber < min) {
                    min = storedNumber;
                }
                if(count == 5) {
                    break;
                }
            } else{
                System.out.println("Invalid number");
                break;
            }
            minimunMaximumInput.nextLine(); // Handle nextline input (?) QUESTION
        }
        System.out.println("The minimum number of this: " + min);
        System.out.println("The maximum number of this: " + max);


        minimunMaximumInput.close();

    }




    }

