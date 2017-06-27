package ReverseOfAString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikhilthakur on 6/22/17.
 */

public class ReverseTest {

    @Test
    public void containsDuplicate(){
        String token = "abddhhdduyufufuanksjndksjdbjs";
        Assert.assertFalse(Reverse.checkForDuplicates(token));
    }

    @Test
    public void doesNotContainDuplicates(){
        String token = "asdfghjk";
        assertTrue(Reverse.checkForDuplicates(token));
    }

    @Test
    public void reverseOfAString(){
        String initialString = "Nikhil";
        assertEquals("lihkiN", Reverse.reverseOfAString(initialString) );
    }

    @Test
    public void reverseOfAStringIgnoreWhiteSpaces(){
        String initialString = "Nik hil";
        assertEquals("lihkiN", Reverse.reverseOfAString(initialString) );
    }

}