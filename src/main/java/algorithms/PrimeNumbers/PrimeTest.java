package main.java.algorithms.PrimeNumbers;

import main.java.algorithms.PrimeNumbers.PrimeNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by nikhilthakur on 6/27/17.
 */
public class PrimeTest {


    public static final int NUMBER_TO_CALCULATE_PRIMES_UNTIL = 10;

    @Test
    public void primeArrayLengthShouldBeOneGreaterThanTheInput() {
        Assert.assertEquals(NUMBER_TO_CALCULATE_PRIMES_UNTIL +1, PrimeNumbers.findPrimes(NUMBER_TO_CALCULATE_PRIMES_UNTIL).length);;
    }

    @Test
    public void primeArrayofInputNumberTenShouldHaveAtleastOneIndexWithAPrime() {
        Boolean aBoolean = PrimeNumbers.findPrimes(NUMBER_TO_CALCULATE_PRIMES_UNTIL)[3];
        Assert.assertTrue(aBoolean.equals(true));
    }



}