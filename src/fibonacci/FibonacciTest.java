package fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nikhilthakur on 6/28/17.
 */
public class FibonacciTest {
    @Test
    public void testSecondNumber(){
        assertEquals(2,Fibonacci.fibo(3));
    }

    @Test
    public void testSeventhNumber(){
        assertEquals(13,Fibonacci.fibo(7));
    }

}