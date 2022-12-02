package problems.string;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";
        String[] words = str.split(" ");
        String word= " ";
        int length=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>length){
                word=words[i];
                length=words[i].length();
            }
        }
        System.out.println("the longest word is "+"'"+word +"'"+" which has a length of "+length);
    }

}

