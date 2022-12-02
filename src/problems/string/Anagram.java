package problems.string;

import java.util.Arrays;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */
    public static void TestAnagram(String str1, String str2) {
        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean ComparResult = Arrays.equals(charArray1, charArray2);

            if (ComparResult) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
    }

    public static void main(String[] args) {

        TestAnagram("ARMY","MARY");

    }

}
