package com.jwd.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Blue");
        color.add("Red");
        color.add("White");
        color.add("Black");
        color.add("Purple");

        System.out.printf("Array List size is: %d \n", color.size());

        for (String c : color
             ) {
            System.out.printf("Array color entity is: %s \n", c);
        }

        Iterator<String> myIter = color.iterator();
        while(myIter.hasNext()) {

            System.out.println(myIter.next());
        }
    }
}
