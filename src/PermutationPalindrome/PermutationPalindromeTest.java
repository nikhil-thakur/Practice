package PermutationPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nikhilthakur on 7/7/17.
 */
public class PermutationPalindromeTest {

    @Test
    public void returnFalseWhenEmptyString() throws Exception {
        assertFalse(PermutationPalindrome.isPermutationPalindrome(""));
    }

    @Test
    public void returnFalsyWhenNullIsPassed(){
        assertFalse(PermutationPalindrome.isPermutationPalindrome(null));
    }

    @Test
    public void testcase1(){
        assertTrue(PermutationPalindrome.isPermutationPalindrome("tact Coa"));
    }

    @Test
    public void testCaseWithEvenletters(){
        assertTrue(PermutationPalindrome.isPermutationPalindrome("lolo"));
    }

    @Test
    public void isNotAPermutationPalindrome() {
        assertFalse(PermutationPalindrome.isPermutationPalindrome("asdfghjkl"));
    }

}