package javaprogram;/*Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/

import java.util.ArrayList;
import java.util.List;

public class Answer_3 {   //Declare Class

    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Green");
        list_Strings.add("Red");
        list_Strings.add("Yellow");
        list_Strings.add("Orange");
        list_Strings.add("Black");
        list_Strings.add("Indigo");
        list_Strings.add("Violet");
        list_Strings.add("Lilac");

        for(String element : list_Strings){   //Using for each loop
            System.out.println(element);
        }
    }
}
