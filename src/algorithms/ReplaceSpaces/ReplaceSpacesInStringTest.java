package algorithms.ReplaceSpaces;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nikhilthakur on 7/6/17.
 */
public class ReplaceSpacesInStringTest {
    public static final String NIKHILTHAKUR = "nikhilthakur";
    public static final String MR_20_NIKHIL_20_THAKUR = "Mr%20Nikhil%20Thakur";
    public static final String TEST_STRING = "Mr Nikhil Thakur    ";

    @Test
    public void replaceSpaces() throws Exception {
        String s = ReplaceSpacesInString.replaceSpaces(TEST_STRING);
        assertTrue(s.equals(MR_20_NIKHIL_20_THAKUR));
    }

    @Test
    public void returnNullWhenNullIsSent() throws Exception {
        assertEquals(null,ReplaceSpacesInString.replaceSpaces(null));
    }

    @Test
    public void returnSameStringWhenNoSpacesAreFound() throws Exception {
        assertEquals(NIKHILTHAKUR, ReplaceSpacesInString.replaceSpaces(NIKHILTHAKUR) );
    }

}