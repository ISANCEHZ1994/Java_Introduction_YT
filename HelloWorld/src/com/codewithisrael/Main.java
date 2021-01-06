package com.codewithisrael;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main { // this is a Class with the name of Main - also a part of the package ABOVE

    public static void main(String[] args) { // this is a Function that is PART of the Main Class
        // the parentheses is a PARAMETER for the function that allows us to pass values to our programs (like in JS duh)
        // NOTE: the main/core method in your program should ALWAYS be called STATIC
        // the RETURN of this method is VOID which means this method will NOT return a value

        // How to declare a variable <---------------------------------
        // int age = 30; // we can also declare multiple variable on the same line - in this case INTEGERS (int)
        // HOWEVER it be NASTY - it would look like [ int age = 30, temp = 20; ] NOT GOOD PRACTICE
        // age = 35; // we can also change what was initially assigned to another value in this case 35
        // int means INTEGER - we NEED to say what datatype it is
        // there are several types not just int - in this case we can ONLY use whole integers
        // age is the name(or label, ALSO called IDENTIFIER) we gave to the variable
        // then the value of the name which is 30

        // we don't need four bytes of memory to save someone's age - one byte will do
        // Note: int uses four bytes of memory (duh) => reference your notebook for more byte information
        byte age = 30;
        // lets say we want to store how many times a youtube video has been watched
        int viewsCount = 123_456_789; // in JAVA we can use an underscore to separate every three
        long viewCount = 1232_122_23213_0L; // To save large integers we NEED to put an L (lower or CAPITAL)
        double price2 = 10.99; // To save decimal integers - NOTE: you can also use float however
        float price = 10.99F; // When using FLOATS you MUST put an F at the end of the # (lower or CAPITAL)
        char letter = 'A'; // NOTE: For SINGLE Characters use SINGLE QUOTES for more Characters use ""
        // Use String - represents a series of characters (char)
        String letters = "Here is multiple char words and stuff whatever Im learning";
        // How to print out with quotes (ESCAPE Elements)
        String doubleQuotes =  "\"Here is multiple char - words and stuff whatever Im learning\"";
        boolean isEligible = false; // Boolean is true or false

        System.out.println(letters); // prints the long string
        System.out.println(doubleQuotes); // we got quotes on the string!
        // Date now = new Date();
        // System.out.println(now);

        byte x= 1;
        byte y = x;
        x = 2;
        System.out.println(y); // Note: This will NOT change the value of y - in Java x and y are DIFFERENT!

        // How to use POINT <------------------------------------
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

        // How to work with ARRAYS <--------------------------
        // Here we a have an INTEGER variable called NUMBERS that is an ARRAY
        int[] numbers = new int[5]; // Since ARRAYS are REFERENCE TYPES we NEED to use the NEW operator
        // Note we can replace int with float or whatever datatype we would need for that array
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
        // THIS WOULD BE ANNOYING - why would you write down everything specificly?
        // lets do it another NEWER WAY!!
        int[] numbersNew = { 1,2,5,4,58 }; // BETTER WAY <-------------------------------------
        Arrays.sort(numbersNew); // this is how to sort the numbers
        System.out.println(Arrays.toString(numbersNew)); // returns sorted numbers Array
        System.out.println(numbers.length); // This returns length => 5
        // In Java arrays have a FIXED SIZE once created we CANNOT ADD OR REMOVE items
        // There IS a way to do that but will show later! (Collection Classes!)

        // Multi-Dimensional Arrays <-----------------------------------------
        // 2D Array to store a matrix OR 3D Array to store data for cube
        int[][] dArray = new int[2][3]; // this is for TWO DIMENSIONAL ARRAYS - for 3 use 3 BRACKETS
        // 2 by 3 matrix so 2 ROWS and 3 COLUMNS
        // To access INDIVIDUAL items in the array you NEED to supply TWO INDEXES
        dArray[0][0] = 1; // first index is the row then the first column and initializing it as 1
        System.out.println(Arrays.toString(dArray)); // use .toString() from Arrays Class to make it readable
        // Wait its not readable it returned => [[I@87aac27, [I@3e3abc88]
        System.out.println(Arrays.deepToString(dArray)); // when dealing with Dimensional Arrays we have to go DEEPER!
        // Our result looks like => [ [1, 0, 0], [0, 0, 0] ] NOTE: 2 ROWS and 3 COLUMNS
        // Below we will improve and make it BETTER!!

        int[][] dArrayBetter = {{ 1,2,3 },{ 4,5,6 }}; // BETTER WAY <--------------------------------------
        // NOTE: This is also 2 ROWS with 3 COLUMNS
        System.out.println(Arrays.deepToString(dArrayBetter)); // result => [[1, 2, 3], [4, 5, 6]]

        // CONSTANTS <------------------------------------
//      float pi = 3.14F; // Note: Remember the F or by default it will just be a decimal
//      pi = 1; // If we make pi => 1 then all calculations with(original) pi will be wrong
        final float PI = 3.14F; // with final - Java will treat pi as a Constant
        // Meaning that we cannot change it's value later on!
        // By convention we name ALL CONSTANTS IN CAPITAL LETTERS

        // ARITHMETIC EXPRESSIONS <-------------------------------------------------
//        int result = 10 + 3; // straightforward adds together to make 13
        // same for subtraction, multiplication - simple and does what it does
        // For division (/) it's different - in Java if numbers were divided (10/3) then Java would
        // Return a whole number - in JAVA since it's the division of two WHOLE numbers
        // then the result will be a WHOLE NUMBER - below is how to fix
        double result = (double) 10/ (double) 3; // we have to declare that its a double for it to return our result correctly
        // Note: we now have to CHANGE int because the result is NOT a whole number
        int a = 1; // increase the value of a by 1
        a++; // BEHOLD the increment operator coming back AGAIN! returns => 2



    };
};
