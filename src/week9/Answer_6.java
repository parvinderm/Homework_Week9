package week9;/*Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/

import java.util.Scanner;

public class Answer_6 {   //Declare class

    public static void main(String[] args) { //Declare main method or predefined method
        int height;
        String c;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the height of the triangle:");
        height = sc.nextInt();

        System.out.println("Enter the character to print the triangle :");
        c=sc.next();
        System.out.println();

        for(int i = 1;i<=height;i++)    //Using nested for loop
        {
            for(int j = 1;j<=i;j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
