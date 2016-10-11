package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Could I acquire your name?");
            Perfect person = new Perfect(input.nextLine());
            System.out.println("Nice to meet you " + person.name +
                    "! Your lucky number is " + person.perfectRandom() + ".");
            System.out.println();
        }
    }
}
