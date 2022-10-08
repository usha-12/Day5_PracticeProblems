package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class EvenOddNumber {
    public static void checkNumberEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("Number is Even :"+number);
        }else {
            System.out.println("Number Is Odd :"+number);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Even Odd Number program");
        checkNumberEvenOrOdd();
    }
}
