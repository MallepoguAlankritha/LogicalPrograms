package com.BridgeLabz;

import java.util.Scanner;

public class PrimeNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the last number till you want to check the Prime Number : ");
            int endNumber = sc.nextInt();
            for (int number=1; number<=endNumber; number++){
                int temp=0;
                for (int i=2; i<number; i++){
                    if (number%i==0){
                        temp+=1;
                    }
                }
                if (temp==0){
                    System.out.println(number);
                }
            }
        }
    }
