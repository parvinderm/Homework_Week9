package javaprogram;/*Write program and add all group names in to array and iterates through for
each loop.*/

import java.util.ArrayList;

public class Answer_9 {     //declare Class

    public static void main(String[] args) {   //Declare main method or predefined method
        ArrayList<String> groupnames = new ArrayList<String>();
        groupnames.add("Java");
        groupnames.add("Restassure");
        groupnames.add("Selenium");
        groupnames.add("Postman");
        System.out.println("Arraylist : " + groupnames);
        System.out.println("Iterating over ArrayList using for each loop");

        for(String groupname: groupnames){
            System.out.print(groupname);
            System.out.print("  ");
        }
    }
}
