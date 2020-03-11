package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { LastDigit();
    }


    public static void LastDigit() {
        Scanner
        Keyboard = new Scanner( System.in);
        int number;

        System.out.println("Type a 4-digit positive number");
        number = Keyboard.nextInt();

        System.out.println("The Last Digit is: " + (number%10));

       }
}