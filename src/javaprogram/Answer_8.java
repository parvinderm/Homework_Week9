package javaprogram;/*Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name.*/

import java.util.HashMap;

public class Answer_8 {   //Declare Class

    public static void main(String[] args) {   //Declare main method or predefined method

        HashMap<String,String>  stationlines = new HashMap<String,String>();

        stationlines.put("south harrow ","Picadilly");
        stationlines.put("Harrow on the hill ","Metropolitan");
        stationlines.put("Harrow Weald ","BakerLoo line");
        stationlines.put("Wembley Park"," jubilee line");
        stationlines.put("Kingcross ","Victoria line");
        stationlines.put("White City","Central line");

        System.out.println("Station and lines in Zone 1");
        System.out.println(stationlines);
    }
}
