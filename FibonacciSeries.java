package com.BridgeLabz;
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to print fibonacci_series upto that index : ");
        int number = sc.nextInt();
        System.out.print("Enter how many times you want to print the FibonacciSeries : ");
        int times = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i=1; i<=number; i++){
        for (int i1=1; i1<=times; i1++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    }
}

