package Bridgelabz.Com.Practice;

import java.util.Scanner;

public class AlphabetVowelConsonant {
    public static void checkVowelOrConsonant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character :");
        char ch = sc.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Vowel :");
        }
        else {
            System.out.println("Consonant :");
        }
    }
    public static void main(String[] args) {
        System.out.println(" Welcome to the program Alphabet Vowel or Consonant ");
        checkVowelOrConsonant();

    }
}
// a e i o u = vowel
// b c d etc.. = consonant
// Program to Check Whether an Alphabet is Vowel or Consonant
