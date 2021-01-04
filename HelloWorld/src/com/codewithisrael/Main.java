package com.codewithisrael;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main { // this is a Class with the name of Main - also a part of the package ABOVE

    public static void main(String[] args) { // this is a Function that is PART of the Main Class
        // the parentheses is a PARAMETER for the function that allows us to pass values to our programs (like in JS duh)
        // NOTE: the main/core method in your program should ALWAYS be called STATIC
        // the RETURN of this method is VOID which means this method will NOT return a value

        // How to declare a variable
        // int age = 30; // we can also declare multiple variable on the same line - in this case INTEGERS (int)
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

        // Remember References in JavaScript - VERY SIMILAR
        // Here we are using the Point class that is defined in this package
        Point point1 = new Point(1,1); // creating values for x and y
        Point point2 = point1;
        // point1 and point2 are referencing the same object in memory
        point1.x = 2; // this should have changed point2
        System.out.println(point2); // this shows that x = 2

        String message = "Hello World" +  "!!"; // this is the shorthand instead of writing [ new String(original: "Hello World") ]
        message.endsWith("!!"); // by putting a dot we can use multiple methods that Java has thru packages
        // the above method returns either true or false - in this case true!
        System.out.println(message.length());// will return the length of string (13)

        System.out.println(age);
        // this is how we can make the terminal give out this comment
        // The tool system for INTELLIJ really helps with Java - Note to self: Try to remember,to not be so reliant

        // How to work with ARRAYS
        // Here we a have an INTEGER variable called NUMBERS that is an ARRAY
        int[] numbers = new int[5]; // Since ARRAYS are REFERENCE TYPES we NEED to use the NEW operator
        // we repeat the type so int[] then inside we SPECIFY the size/length of the array - How many items??
        numbers[0] = 1; // here we are referencing the first item in the array and setting it to 1
        numbers[1] =2;

        // numbers[10] = 3; // this will return an EXCEPTION - Java's way to report errors
        // We don't have a length of 10 so its not valid

        System.out.println(numbers); // Strange - printing numbers by itself returns => [I@1218025c
        // By default when printing an array Java returns a string which is calculated
        // based on the address of this object in MEMORY
        // In Java we have a class called ARRAY that in defined in the package java.util
        // (at top) => import java.util.Arrays;
        System.out.println(Arrays.toString( numbers));
        // here it returns the array how we want to see it however since only two numbers were assigned
        // it only shows [1, 2, 0, 0, 0] again by default


    };
};
