/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int first_number = parseInt(input.nextLine());

        System.out.print("What is the second number? ");
        int second_number = parseInt(input.nextLine());

        int add = first_number + second_number;
        int subtract = first_number - second_number;
        int multiply = first_number * second_number;
        int divide = first_number / second_number;

        System.out.println(first_number + " + " + second_number + " = " + add);
        System.out.println(first_number + " - " + second_number + " = " + subtract);
        System.out.println(first_number + " * " + second_number + " = " + multiply);
        System.out.println(first_number + " / " + second_number + " = " + divide);
    }
}
