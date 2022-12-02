package problems.string;

import java.util.Scanner;

public class Palindrome {

    /*
     *
     * write java code to check if a given String is Palindrome
     * when a String is reversed and remains unchanged, that is called Palindrome
     * example, MOM,DAD,MADAM,KAYAK
     *
     */

    public static void main(String[] args) {

        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to test if it is a palindrome.");
        original = sc.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");

    }
}
//MOM,DAD,MADAM,KAYAK
