package PrimeNumbers;

import java.util.Arrays;

/**
 * Created by nikhilthakur on 6/27/17.
 * This is using Sieve of Eratosthenes and is completed in a complexity of O(n.log log n)
 * If the number hasn't been crossed of till the square root of itself, then its a prime number
 */
public class PrimeNumbers {

    public static Boolean[] findPrimes(int endIndexNumber) {
        Boolean[] prime = new Boolean[endIndexNumber+1];

        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;

        for (int positiveInteger = 2; positiveInteger <= Math.sqrt(endIndexNumber); positiveInteger++){
            if (prime[positiveInteger]){
                for (int multiple = 2; positiveInteger*multiple <= endIndexNumber; multiple++){
                    prime[positiveInteger*multiple] = false;
                }
            }
        }
        return prime;
    }
}
