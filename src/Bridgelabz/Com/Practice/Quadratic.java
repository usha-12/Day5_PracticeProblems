package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class Quadratic {
    public static void checkQuadratic(){
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of coefficient :");
        a = sc.nextInt();
        System.out.println("Enter the value of coefficient1 :");
        b = sc.nextInt();
        System.out.println("Enter the value of constant");
        c = sc.nextInt();
        double discriminant = Math.pow(a, 2) - (4*a*c);
        double root1 = (Math.sqrt(discriminant)-b)/(2*a);
        double root2 = (-Math.sqrt(discriminant)-b)/(2*a);
        System.out.println("Roots of the quadratic equation "+a+ "x^2 +"+b+"x +"+c+" ");
        System.out.println("Root1 :"+root2);
        System.out.println("Root2 :"+root2);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Quadratic program");
        checkQuadratic();
    }
}
/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)*/
