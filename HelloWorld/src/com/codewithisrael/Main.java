package com.codewithisrael;

import java.awt.*;
import java.util.Date;

public class Main { // this is a Class with the name of Main - also a part of the package ABOVE

    public static void main(String[] args) { // this is a Function that is PART of the Main Class
        // the parentheses is a PARAMETER for the function that allows us to pass values to our programs (like in JS duh)
        // NOTE: the main/core method in your program should ALWAYS be called STATIC
        // the RETURN of this method is VOID which means this method will NOT return a value

        // How to declare a variable
        // int age = 30; // we can also declare multiple variable on the same line
        // HOWEVER it be NASTY - it would look like [ int age = 30, temp = 20; ] NOT GOOD PRACTICE
        // age = 35; // we can also change what was initially assigned to another value in this case 35
        // int means INTEGER - we NEED to say what datatype it is
        // there are several types not just int - in this case we can ONLY use whole integers
        // age is the name(or label, ALSO called IDENTIFIER) we gave to the variable
        // then the value of the name which is 30

        // we don't need four bytes of memory to save someone's age - one byte will do
        byte age = 30;
        // lets say we want to store how many times a youtube video has been watched
        int viewsCount = 123_456_789; // in JAVA we can use an underscore to separate every three
        long viewCount = 1232_122_23213_0L; // To save large integers we NEED to put an L (lower or CAPITAL)
        double price2 = 10.99; // To save decimal integers - NOTE: you can also use float however
        float price = 10.99F; // When using FLOATS you MUST put an F at the end of the # (lower or CAPITAL)
        char letter = 'A'; // NOTE: For SINGLE Characters SINGLE QUOTES for more Characters use ""
        boolean isEligible = false; // Boolean is true or false

        // Date now = new Date();
        // System.out.println(now);

        byte x= 1;
        byte y = x;
        x = 2;
        System.out.println(y); // Note: This will NOT change the value of y - in Java x and y are DIFFERENT!

        // Here we are using the Point class that is defined in this package
        Point point1 = new Point(1,1); // creating values for x and y

        System.out.println(age);
        // this is how we can make the terminal give out this comment
        // The tool system for INTELLIJ really helps with Java - Note to self: Try to remember,to not be so reliant
    };
};
