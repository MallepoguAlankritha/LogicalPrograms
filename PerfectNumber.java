package com.BridgeLabz;

import java.util.Scanner;

public class PerfectNumber {

        public static void main(String[] args) {
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check whether the number is perfect number or not : ");
            int number = sc.nextInt();
            for (int i=1;i<number;i++){
                if (number%i==0){
                    sum+=i;
                }
            }
            if (number==sum){
                System.out.println(number + " is a Perfect Number");
            }
            else {
                System.out.println(number + " is not a Perfect Number");
            }
        }
}
