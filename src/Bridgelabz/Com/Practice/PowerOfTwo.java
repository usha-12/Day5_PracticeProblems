package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class PowerOfTwo {
    public static void checkPowerOfTwo(){
        System.out.println("Enter the value of Exponent: ");
        Scanner sc = new Scanner(System.in);
        int exponent = sc.nextInt();
        if (exponent >= 0){
            if (exponent < 31){
                System.out.println("Display power of 2 ");
                for (int i = 0; i <= exponent; i++)
                    System.out.println("2^"+i+ "=" +(int)(Math.pow(2,i)));
            }
            else
                System.out.println("Integer overflow error.\\nKindly enter an exponential value less than 31");
        }
        else
            System.out.println("Enter a positive exponent value. \\nPlease try again!");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the power of two program");
        checkPowerOfTwo();


    }
}
/*              Power of 2
a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
*/
