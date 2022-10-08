package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class ZeroSumTriple {
    public static void checkZeroSumTriple(){
        int array[] = null;
        int triplets= 0;
        System.out.println("Enter the Number of the Integers:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        array = new int[length];
        System.out.println("Enter the Integers..");
        for (int i = 0; i<array.length; i++){
            System.out.println("Enter Integer"+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        boolean check = false;
        for (int i =0; i<length-2; i++) {
            for (int j = i + 1; j < length - 1; j++)
                for (int k = j + 1; k < length; k++)
                    if ((array[i] + array[j] + array[k] == 0)) {
                        triplets++;
                        System.out.println(array[i] + " + " + array[j] + " + " + array[j] + "=0");
                        check = true;
                    }
            if(check == false)
                System.out.println(" triplets don't exit");
            // else
            //System.out.println(" distinct triplets:"+triplets);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Zero sum Integer program");
        checkZeroSumTriple();

    }
}
/*    Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.*/
