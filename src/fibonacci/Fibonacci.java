package fibonacci;

/**
 * Created by nikhilthakur on 6/28/17.
 * This class will help to compute the Nth Fibonacci number
 */
public class Fibonacci {
    static int fibo(Integer number){
        if (number <= 0)
            return 0;
        else if (number == 1)
            return 1;
        else return fibo(number-1)+ fibo(number-2);
    }
}
