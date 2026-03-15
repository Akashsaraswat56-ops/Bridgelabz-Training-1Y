package com.Gla.Array;
import java.util.Scanner;
    public class ArraySumInput {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] arr = new double[10];
            double total = 0.0;
            int index = 0;
            while(true) {
                System.out.print("Enter a number (0 or negative to stop, max 10): ");
                double num = scanner.nextDouble();

                if(num <= 0 || index == 10) {
                    break;
                }
                arr[index] = num;
                index++;
            }
            for(int i = 0; i < index; i++) {
                System.out.println("Number: " + arr[i]);
                total += arr[i];
            }

            System.out.println("Sum of all numbers: " + total);
        }
    }
