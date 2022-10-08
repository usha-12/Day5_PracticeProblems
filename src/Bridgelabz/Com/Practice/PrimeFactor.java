package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class PrimeFactor {
    public static void checkPrimeFactor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();
        //int storeValue = number;
        int i = 2;
        System.out.println("Prime Factor of number :"+number);
        while (number>1){
            if (number%i == 0){
                System.out.println(i+" ,");
                number = number/i;
            }
            else
                i++;//3
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the prime factor number program");
        checkPrimeFactor();
    }
}
/*          Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.*/
