package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayExceptItselfTest {
    @Test
    public void productExceptSelf() throws Exception {
        int[] input = new int[4];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;

        ArrayExceptItself arrayExceptItself = new ArrayExceptItself();
        arrayExceptItself.productExceptSelf(input);
    }

}