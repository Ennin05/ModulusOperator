package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
    }


    public static void testOddness() {
        System.out.println("testOddness");

        int pNumber=10;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type a positive number");
        pNumber= keyboard.nextInt();


        System.out.println("Number is odd "+ (pNumber % 2 !=0));

    }
}