package javaprogram;/*Write program and add all group members names in to array and iterates
through for each loop and print your name.*/

import java.util.ArrayList;

public class Answer_10 {   //Declare Class

    public static void main(String[] args) {    //Declare Main method or predefined method
        ArrayList<String> groupmember  = new ArrayList<String>();
        groupmember.add("Sonia");
        groupmember.add("Bhumi");
        groupmember.add("Urvi");
        groupmember.add("Dipali");
        groupmember.add("Kuldip");
        System.out.println("Arraylist :" +groupmember);


        System.out.println("Iterating over Arraylist using for each loop");
        for(String name :groupmember){
            System.out.println("Sonia");
            break;
        }
    }
}
