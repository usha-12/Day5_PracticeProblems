package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void checkSwapTwoNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstNumber = sc.nextInt();//100
        System.out.println("Enter Second Number :");
        int secondNumber = sc.nextInt();//200
        System.out.println("Before Swapping :"+firstNumber+ " "+secondNumber);
        int swappingVariable = firstNumber;// swappingVariable = 100
        firstNumber = secondNumber;// firstNumber = 200
        secondNumber = swappingVariable;// secondNumber = 100
        System.out.println("After Swapping :"+firstNumber+ " "+secondNumber);

    }
    public static void main(String[] args) {

        System.out.println("Welcome tho the Swap Two Number program ");
        checkSwapTwoNumber();


    }
}
// Swap Two Numbers
/*Before Swap
First Number = 10
* Second Number = 20
*       After Swap
* Fourth Number = 20
* swapVariable
* Fifth Number = 10*/

