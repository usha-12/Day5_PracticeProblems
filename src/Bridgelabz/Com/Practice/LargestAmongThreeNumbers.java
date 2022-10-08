package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void checkLargestAmongThreeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number :");
        int secondNumber = sc.nextInt();
        System.out.println("Enter Third Number :");
        int thirdNumber = sc.nextInt();
        if (firstNumber>secondNumber){//first condition
            if (firstNumber>thirdNumber)
                System.out.println("first Number is Largest Number:"+firstNumber);
            else
                System.out.println("Third Number is Largest Number:"+thirdNumber);
        }
        else {
            if (secondNumber>thirdNumber)
                System.out.println("Second Number is Largest Number:"+secondNumber);
            else
                System.out.println("Third Number is Largest Number:"+thirdNumber);
        }
    }
    public static void main(String[] args) {
        System.out.println(" Welcome to the program Largest Among Three Numbers");
        checkLargestAmongThreeNumber();
    }

}

