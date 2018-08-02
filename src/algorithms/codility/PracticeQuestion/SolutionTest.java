package algorithms.codility.PracticeQuestion;

import algorithms.PermutationPalindrome.PermutationPalindrome;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private int[] negativeNumbers = {-1,-2,-3};

    @Test
    @Ignore
    public void returnFalseWhenEmptyString() throws Exception {
        int[] numbers = {1,1,0,1,0,0};
        int[] numbers1 = {0,0,0,0,0,0};
        int[] numbers2 = {1,0,0,0,0,0};
        int[] numbers3 = {0,0,0,0,0,1};
        int[] numbers4 = {1,1,0,0,0,0};
        int[] numbers5 = {1,1,0,1,0,0};
        int[] numbers6 = {1,1,0,1,0,0};
        int[] numbers7 = {1,1,0,1,0,0};
        int[] numbers8 = {1,1,0,1,0,0};
        int[] numbers9 = {1,1,0,1,0,0};
        int[] numbers10 ={1,1,0,1,0,0};



        assertEquals(4,Solution.solution(numbers6));
    }
}