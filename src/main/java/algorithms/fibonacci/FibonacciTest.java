package main.java.algorithms.fibonacci;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nikhilthakur on 6/28/17.
 */
public class FibonacciTest {
    @Test
    public void testSecondNumber(){
        assertEquals(4, Fibonacci.fibo(3).length);
    }

    @Test
    public void testSeventhNumber(){
        assertEquals(8, Fibonacci.fibo(7).length);
    }

}