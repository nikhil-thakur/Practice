package algorithms.intersectionArray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionArrayTest {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void intersection() throws Exception {
        int[] array1 = new int[] {1};
        int[] array2 = new int[] {1};

        IntersectionArray intersectionArray = new IntersectionArray();
        int[] result = intersectionArray.intersection(array1, array2);
        Assert.assertEquals(1, result[0]);

    }

}