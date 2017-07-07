package PermutationPalindrome;

/**
 * Created by nikhilthakur on 7/7/17.
 */
public class PermutationPalindrome {

    public static final int ALPHABETS_IN_ENGLISH = 256;

    public static boolean isPermutationPalindrome(String string){
        if (string == null || string.isEmpty()){
            return false;
        }

        int papaCounter = 0;
        boolean[] alphabet = new boolean[ALPHABETS_IN_ENGLISH];
        char[] chars = removeSpacesFromString(string.toLowerCase());

        for (char character: chars) {
            if (alphabet[character] == false) {
                alphabet[character] = true;
                papaCounter++;
            }
            else {
                alphabet[character] = false;
                papaCounter--;
            }
        }

        if (chars.length %2 ==0 && papaCounter == 0)
            return true;
        if (chars.length %2 ==1 && papaCounter == 1)
            return true;

        return false;

    }

    private static char[] removeSpacesFromString(String originalString) {
        int spacesToBeRemoved = 0;

        char[] chars = originalString.toCharArray();
        for (char character: chars){
            if (character == ' ')
                spacesToBeRemoved++;
        }

        char[] trueInput = new char[chars.length-spacesToBeRemoved];
        int trueInputCounter = 0;

        for (int counter= 0; counter <= chars.length -1 ; counter++) {
            if (chars[counter] != ' '){
                trueInput[trueInputCounter] = chars[counter];
                trueInputCounter++;
            }
        }

        return trueInput;

    }
}
