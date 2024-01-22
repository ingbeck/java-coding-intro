package org.example;

import java.util.function.ToDoubleBiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Java is cool!");

        String a = "a";
        String b = "b";
        String sum = a + b;

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