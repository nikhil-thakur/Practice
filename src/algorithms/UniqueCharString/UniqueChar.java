package algorithms.UniqueCharString;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.

 Note: You may assume the string contain only lowercase letters.
 */
public class UniqueChar {
    public static int computeFirstUniqueElement(String input) {
        if (input == null || input.isEmpty()) return -1;
        char[] chars = input.toCharArray();
        Map<Character, Integer> result = new LinkedHashMap<>();
        Set<Character> uniqueness = new HashSet<>();


        for (int index = 0; index< chars.length; index++){
            if (uniqueness.contains(chars[index])){
                result.remove(chars[index]);
                continue;
            }
            else {
                result.put(chars[index], index);
                uniqueness.add(chars[index]);
            }
        }

        return result.size() == 0 ? -1 : result.entrySet().iterator().next().getValue();
    }
}
