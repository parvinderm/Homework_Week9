package week9;/*Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * * */

public class Answer_8 {     //Declare Class

    public static void main(String[] args) {   //Declare Main Method or predefined method

        int rows = 5;    //Declare Local Variable

        for(int x = 1;x<=rows; x++){      //Using for loop
            for(int i = 1;i<=x;i++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
