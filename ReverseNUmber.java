package com.BridgeLabz;

import java.util.Scanner;

public class ReverseNUmber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to reverse it : ");
            int number = sc.nextInt();
            int rev = 0; int rem;
            while (number!=0){
                rem=number%10;
                rev=rev*10+rem;
                number=number/10;
            }
            System.out.print("The reversed number is : " + rev);
        }
    }