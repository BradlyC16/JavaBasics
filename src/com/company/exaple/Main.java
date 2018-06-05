package com.company.exaple;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean hasACat = true;
        char letter = 'A';
//        String hello = "Hello World!";
        int number = 2147483647;
        double decimalNumber = 3.14;


        int add = 5 + 4;
        int subtract = 5 - 4;
        int multiply = 5 * 4;
        int divide = 4 / 5;

//        System.out.println("The time of day is "  + (5 - 2));

//        System.out.println(divide);

//        System.out.println("This is the modulo " + (4 % 5));

        //This is an example of concatenation
        String hello = "Hello";
        String name = "Crystal";

        System.out.println(hello + " " + name);


//        System.out.println("What is your name?");
//        name = input.nextLine();
//
//        System.out.println(hello + " " +  name);
//
//        System.out.println("What greeting would you like?");
//        hello = input.nextLine();
//
//        System.out.println(hello + " " +  name);
//

        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What would you like for me to call you? ");
        name = input.nextLine();

        System.out.println(hello + " " + name + "! " + "You are " + age);


    }


}

