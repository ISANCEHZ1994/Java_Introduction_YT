package com.codewithisrael;

public class Main { // this is a Class with the name of Main - also a part of the package ABOVE

    public static void main(String[] args) { // this is a Function that is PART of the Main Class
        // the parentheses is a PARAMETER for the function that allows us to pass values to our programs (like in JS duh)
        // NOTE: the main/core method in your program should ALWAYS be called STATIC
        // the RETURN of this method is VOID which means this method will NOT return a value

        // How to declare a variable
        int age = 30; // we can also declare multiple variable on the same line
        // HOWEVER it be NASTY - it would look like [ int age = 30, temp = 20; ] NOT GOOD PRACTICE
        age = 35; // we can also change what was initially assigned to another value
        // int means INTEGER - we NEED to say what datatype it is
        // there are several types not just int - in this case we can ONLY use whole integers
        // age is the name(or label, ALSO called IDENTIFIER) we gave to the variable
        // then the value of the name which is 30


        System.out.println(age);
        // this is how we can make the terminal give out this comment
        // The tool system for INTELLIJ really helps with Java - Note to self: Try to remember,to not be so reliant
    };
};
