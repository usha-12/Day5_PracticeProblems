package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class Array2D {
    public static void print2Darry(){
        int array[][] = null;
        System.out.println("Enter the Number of rows in your Array:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the Number of columns is your Array: ");
        int columns = sc.nextInt();
        array = new int[rows][columns];
        for (rows = 0; rows< array.length; rows++){
            for (columns = 0; columns< array.length; columns++){
                array[rows][columns] = rows*10 + columns*10;
                System.out.print(array[rows][columns]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 2-D array Program");
        print2Darry();
    }
}
/*              2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.*/
