package algorithms.UniqueCharString;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCharTest {
    @Test
    public void testForNoUniqueValue() throws Exception {
        int aaaa = UniqueChar.computeFirstUniqueElement("aaaa");
        Assert.assertEquals("Should be returning -1 when no unique element is found in the string",-1 , aaaa);
    }

    @Test
    public void testForNoOneValue() throws Exception {
        int aaaa = UniqueChar.computeFirstUniqueElement("cabc");
        Assert.assertEquals("This input has character a as the first unique element, therefore 1 should be returned",1,aaaa);
    }

    @Test
    public void testForEmpty() throws Exception {
        int aaaa = UniqueChar.computeFirstUniqueElement("");
        Assert.assertEquals("If a empty string is passed, -1 should be returned",-1 ,aaaa);
    }

    @Test
    public void testForNull() throws Exception {
        int aaaa = UniqueChar.computeFirstUniqueElement(null);
        Assert.assertEquals("If a null string is passed, -1 should be returned", -1,aaaa );
    }

}