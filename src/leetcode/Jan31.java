package leetcode;

import java.util.Arrays;

public class Jan31 {

    public static char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char first = letters[0];

        for (char x : letters) {
            if (x > target) {
                return x;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        char result = nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter: " + result);
    }
}
