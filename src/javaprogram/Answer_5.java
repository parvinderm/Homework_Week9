package javaprogram;/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/

import java.util.ArrayList;

public class Answer_5 {   //Declare Class


    public static void main(String[] args) {   //Declare main method or predefined method


        ArrayList<String> t = new ArrayList<String>();
        t.add("Jubliee");
        t.add("Picadily");
        t.add("Metropolitan");
        t.add("Bakerloo");
        t.add("Central Line");
        t.add("Waterloo &City");
        t.add("District");
        t.add("Hammersmith & City");
        t.add("Victoria line");

        System.out.println("Original array list :"+t);
        System.out.println("Checking the above list is empty or not:"+t.isEmpty());
    }
}
