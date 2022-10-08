package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class Distance {
        public static void checkDistance() {
            int xCoordinate = 0;
            int yCoordinate = 0;
            double distance = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the abscissa (x-coordinate) :");
            xCoordinate = sc.nextInt();
            System.out.println("Enter the ordinate (y-coordinate) :");
            yCoordinate = sc.nextInt();
            distance = Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
            System.out.println("Distance of the point(" + xCoordinate + ", " + yCoordinate + ") from origin is");
            System.out.println(" units : " + distance);


        }

        public static void main(String[] args) {
            System.out.println("Welcome to the distance program");
            checkDistance();
        }
    }
/*Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/

