package algorithms.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        char key;
        char value;

        //If the lengths of the strings is unequal, then the strings are not isomorphic
        if(char1.length != char2.length) return false;

        //Create a map with key and value as character
        Map<Character, Character> dictionary = new HashMap<>(char1.length);

        for(int index=0; index < char1.length; index++){
            key = char1[index];
            value = char2[index];


            if(dictionary.containsKey(key)) {
                char temp = dictionary.get(key);
                if(temp != value) return false;
            }

        }
        return true;
    }
}
