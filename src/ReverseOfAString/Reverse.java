package ReverseOfAString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reverse {

    public static Boolean checkForDuplicates(String tokenWithDuplicates) {
        char[] tokenArray = tokenWithDuplicates.toCharArray();

        Set mySet = new HashSet();
        for (char character: tokenArray) {
            mySet.add(character);
        }
        if (mySet.size() == tokenArray.length)
            return true;
        else return false;
    }

    public static String reverseOfAString(String inputString){
        char[] charArray = inputString.toCharArray();
        int length = charArray.length;
        char whitespace = ' ';
        char[] reverseString = new char[length];
        for (int charArrayIndex = 0; charArrayIndex < length; charArrayIndex++){
            if (charArray[charArrayIndex] != whitespace)
                reverseString[length-(charArrayIndex+1)] = charArray[charArrayIndex];
        }
        return  String.valueOf(reverseString);
    }
}
