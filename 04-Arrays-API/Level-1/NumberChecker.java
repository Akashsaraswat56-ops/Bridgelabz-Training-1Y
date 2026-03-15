package com.Gla.Array;
import java.util.*;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

//inputting  5 numbers
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number
        for(int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if(num > 0) {
                if(num % 2 == 0) {
                    System.out.println(num + " is positive even.");
                } else {
                    System.out.println(num + " is positive odd.");
                }
            } else if(num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[4];
        if(first == last) {
            System.out.println("First and last elements are equal.");
        } else if(first > last) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
    }
}

