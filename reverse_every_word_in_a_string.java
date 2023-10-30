import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        String input = "the sky is blue";
        String[] words = input.split(" "); 
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedString.append(reversedWord).append(" ");
        }

        String result = reversedString.toString().trim(); 
        System.out.println(result);
    }

    public static String reverseWord(String word) {
        char[] wordArray = word.toCharArray();
        int left = 0;
        int right = wordArray.length - 1;

        while (left < right) {
            
            char temp = wordArray[left];
            wordArray[left] = wordArray[right];
            wordArray[right] = temp;

            left++;
            right--;
        }

        return new String(wordArray);
    }
}
