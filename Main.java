package com.company;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("HelloWorld");

            Task2 obj = new Task2();

            Interval interval = new Interval();
            System.out.print("Beginning of the interval: ");
            interval.beginning = in.nextInt();

            System.out.print("End of the interval: ");
            interval.end = in.nextInt();

            System.out.print("Odd numbers: ");
            interval.Odd();
            System.out.print("Even numbers: ");
            interval.Even(); ;



            System.out.println("Sum of odd numbers: " + interval.SumOdd());
            System.out.println("Sum of even numbers: " + interval.SumEven());

            System.out.print("Lenght of Fibonacci: ");
            int length = in.nextInt();
            if (interval.end % 2 != 0) {
                System.out.print("Fibonacci: " + interval.end + " ");
                interval.even++;
            }
            else if (interval.end % 2 == 0) {
                System.out.print("Fibonacci: " + (interval.end - 1) + " ");
                interval.odd++;
            }
            for (int i = 0; i < length - 1; ++i)
                System.out.print(interval.Fibonacci(i) + " ");

            System.out.println("\nRate of odd numbers: " + interval.rateOdd(length) + "%");
            System.out.println("Rate of even numbers: " + interval.rateEven(length) + "%");
        }
    }
