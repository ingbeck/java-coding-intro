package org.example;

import java.util.function.ToDoubleBiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//1 Java Intro
//Step 1.1: Create a new class with the name 'HelloWorld'
public class HelloWorld {

    //Step 1.2: Define the main method in your class.
    public static void main(String[] args) {

        //Step 1.3 - 1.6:
        System.out.println("Java is cool!");

        //2 Coding: Operators
        //Step 2.1: Declare two variables 'a' and 'b' of type int and assign them any integer values.
        int a = 1;
        int b = 2;

        //Step 2.2: Add the values of 'a' and 'b' and store the result in a new variable 'sum'.
        int sum = a + b;

        //Step 2.3: Print the value of 'sum' to the console, along with the text 'Sum: '.
        System.out.println("Sum: " + sum);


        int zahlInt1 = 52;
        int zahlInt2 = 19;
        double zahlDouble1 = 34.56;
        double zahlDouble2 = 17.4;
        float zahlFloat1 = 65.4321F;
        float zahlFloat2 = 12.3456F;

        System.out.println("\nInt:");
        System.out.println("----------");
        System.out.println(zahlInt1 + " + " + zahlInt2 + " = " + (zahlInt1 + zahlInt2));
        System.out.println(zahlInt1 + " - " + zahlInt2 + " = " + (zahlInt1 - zahlInt2));
        System.out.println(zahlInt1 + " * " + zahlInt2 + " = " + (zahlInt1 * zahlInt2));
        System.out.println(zahlInt1 + " / " + zahlInt2 + " = " + (zahlInt1 / zahlInt2));
        System.out.println(zahlInt1 + " % " + zahlInt2 + " = " + (zahlInt1 % zahlInt2));
        System.out.println(zahlInt1 + " > " + zahlInt2 + " = " + (zahlInt1 > zahlInt2));
        System.out.println(zahlInt1 + " < " + zahlInt2 + " = " + (zahlInt1 < zahlInt2));
        System.out.println(zahlInt1 + " == " + zahlInt2 + " = " + (zahlInt1 == zahlInt2));

        System.out.println("\nDouble:");
        System.out.println("----------");
        System.out.println(zahlDouble1 + " - " + zahlDouble2 + " = " + (zahlDouble1 - zahlDouble2));
        System.out.println(zahlDouble1 + " / " + zahlDouble2 + " = " + (zahlDouble1 / zahlDouble2));
        System.out.println(zahlDouble1 + " % " + zahlDouble2 + " = " + (zahlDouble1 % zahlDouble2));
        System.out.println(zahlDouble1 + " * " + zahlDouble2 + " = " + (zahlDouble1 * zahlDouble2));
        System.out.println(zahlDouble1 + " + " + zahlDouble2 + " = " + (zahlDouble1 + zahlDouble2));

        System.out.println("\nFloat:");
        System.out.println("----------");
        System.out.println(zahlFloat1 + " - " + zahlFloat2 + " = " + (zahlFloat1 - zahlFloat2));
        System.out.println(zahlFloat1 + " / " + zahlFloat2 + " = " + (zahlFloat1 / zahlFloat2));
        System.out.println(zahlFloat1 + " % " + zahlFloat2 + " = " + (zahlFloat1 % zahlFloat2));
        System.out.println(zahlFloat1 + " * " + zahlFloat2 + " = " + (zahlFloat1 * zahlFloat2));
        System.out.println(zahlFloat1 + " + " + zahlFloat2 + " = " + (zahlFloat1 + zahlFloat2));




    }
}