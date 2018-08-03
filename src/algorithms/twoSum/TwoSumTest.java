package algorithms.twoSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(new int[]{1, 2, 3, 4, 5, 6}, 9);
        int[] expected = {3, 4};
        Assert.assertTrue(Arrays.equals(expected, ints));
    }

}