package fibonacci;

/**
 * Created by nikhilthakur on 6/28/17.
 * This class will help to compute the Nth Fibonacci number
 */
public class Fibonacci {

    static int[] fibo(Integer number){
        int[] array = new int[number + 1];

        for (int counter = 0; counter <number; counter++){
            System.out.println(fibo(number, array));
        }
        return array;
    }

    static int fibo(Integer number, int[] array){
        if (number <= 0)
            return 0;
        else if (number == 1)
            return 1;
        else if (array[number] > 0)
            return array[number];
        array[number] =  fibo(number-1, array)+ fibo(number-2, array);
        return array[number];
    }
}
