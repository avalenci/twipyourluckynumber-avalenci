package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Could I acquire your name?");
            Perfect person = new Perfect(input.nextLine());
            int luckyNumber = person.perfectRandom();
            System.out.println("Nice to meet you " + person.name +
                    "! Your lucky number is " + luckyNumber + ".");
            while (true) {
                System.out.println("\nType (0) to exit.\nType (1) for your name and number." +
                        "\nType (2) to enter another name.");
                String a = input.nextLine().trim();
                if (a.equals("0")) {
                    b = false;
                    break;
                }
                else if (a.equals("1"))
                    System.out.println("Your name is " + person.name + " and your lucky number is " + luckyNumber);
                else if (a.equals("2"))
                    break;
            }
        }
    }
}
