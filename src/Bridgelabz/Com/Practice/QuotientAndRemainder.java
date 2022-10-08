package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void checkQuotientRemainder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend :");
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor :");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " +quotient+"\nremainder = "+remainder);


    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Program Quotient and Remainder");
        checkQuotientRemainder();

    }
}

