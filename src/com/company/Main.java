package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter they maximum number you want");

        int maxNum = input.nextInt();
        int i = 0;
        String numbers = ("");
        while (i < maxNum) {
            i++;
            numbers = numbers + i;
            System.out.println(numbers);

        }

    }
}
