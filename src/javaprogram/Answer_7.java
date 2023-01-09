package javaprogram;/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;

public class Answer_7 {    //Declare Class

    public static void main(String[] args) {   //Declare main method or predefined method
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        people.put("sonia",33);
        people.put("Jignesh",28);
        people.put("Manu",35);
        people.put("Krisha",23);
        people.put("Tanishka",18);
        people.put("Jia",29);
        people.put("Krishiv",36);

        for(String i:people.keySet()){
            System.out.println(" key  :" +   i   +   " value: "  +   people.get(i));
        }
    }
}
