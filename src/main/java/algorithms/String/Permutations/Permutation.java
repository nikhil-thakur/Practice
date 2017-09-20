package main.java.algorithms.String.Permutations;

import java.util.ArrayList;

/**
 * Created by nikhilthakur on 6/28/17.
 * This code will count all the permutations of a String
 */
public class Permutation {
    static ArrayList<String> finalArray = new ArrayList();
    static void permutation(String string){
        permutation(string,"");
    }

    static ArrayList  permutation(String string, String prefix){
        if (string.length() == 0){
            System.out.println(prefix);
            finalArray.add(prefix);
        }
        else {
            for (int counter = 0; counter < string.length(); counter++) {
                String temp = string.substring(0, counter) + string.substring(counter + 1);
                permutation(temp, prefix+string.charAt(counter));
            }
        }
        return finalArray;
    }
}
