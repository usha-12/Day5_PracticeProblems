package Bridgelabz.Com.Practice;

import java.util.Scanner;

//1. century year (100%=0 and 400%=0) 2000 2400 -between leap year 400 gap of year            1700 1800 1900 not leap year
//2. yearly (100%=0 and 4%=0) 2020 2024- between leap year 4 gap of year      2021 2022 2023 not leap year
public class LeapYear {
    public static void checkLeapYearOrNot(){
        boolean check = false;
        System.out.println("Enter a year to check whether it is Leap Year or not:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%100 == 0 && year%400 == 0 || year%100 !=0 && year%4 == 0){

            System.out.println("Year is Leap Year :"+year);
        }else
            System.out.println("Year is not Leap Year :"+year);


    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Leap year program");
        checkLeapYearOrNot();
    }
}
/*              Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.*/
