package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class WindChill {
    public static void checkWindChill() {
        System.out.println("In order to calculate the wild chill");
        System.out.println("Enter the Wild Speed (miles/hour) :");
        Scanner sc = new Scanner(System.in);
        int windSpeed = sc.nextInt();
        System.out.println("Enter the Temperature (Fahrenheit) :");
        int temperature = sc.nextInt();
        if (temperature > -50 && temperature <= 50)
            if (windSpeed > 3 && windSpeed < 110) {
                double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
                System.out.println("The current Wild chill is " + String.format("%.1f", windChill + "Fahrenheit"));
            } else {
                System.out.println("Wind Chill is defined for Wind Speeds between 3 miles/hour and 110 miles/hour");
            }else
            System.out.println("Wind Chill is defined for temperatures below 50 Fahrenheit");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program of WindChill");
        checkWindChill();
    }
}
/*Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:
w=35.74+0.6215t+(0.4275t-35.75)v^0.16
Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).*/
