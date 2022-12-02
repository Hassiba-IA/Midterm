package problems.string;

import java.util.Scanner;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */
// Function to print all the permutations of str
    static void printPermutn(String str, String result) {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(result + " ");
        }

        for (int i = 0; i < str.length(); i++) {

            // with character of str
            char ch = str.charAt(i);

            String str2 = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            printPermutn(str2, result + ch);
        }
    }

    public static void main(String[] args) {
        //"ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        System.out.println("Inter the string for compute all permutation of a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printPermutn(input, "");

        //run your code here
    }
}
