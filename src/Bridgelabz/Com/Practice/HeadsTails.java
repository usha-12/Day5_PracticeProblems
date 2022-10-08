package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class HeadsTails {
    public static void checkHeadsAndTails(){
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();//flips save here from the user
        while (count <= flips){//condition for flips
            random = Math.random();
            System.out.println(count+" "+random);
            if (random < 0.5){
                heads++;
                System.out.println("Heads");
            }else {
                tails++;
                System.out.println("Tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of heads :"+heads);
        System.out.println("Number of tails :"+tails);
        //count the percentage of heads and tails
        double headPercent = (double)heads/flips*100;
        System.out.println("percentage of heads: "+headPercent);
        double tailPercent = (double)tails/flips*100;
        System.out.println("percentage of tails: "+tailPercent);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the program Flip Coin and print percentage of Heads and Tails");
        checkHeadsAndTails();
    }
}
/*     Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails*/
