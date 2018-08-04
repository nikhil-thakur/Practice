package algorithms.isomorphicStrings;

import org.junit.Assert;
import org.junit.Test;

public class isomorphicStringTest {
    @Test
    public void isIsomorphic() throws Exception {
        IsomorphicString isomorphicString = new IsomorphicString();
        boolean isomorphic = isomorphicString.isIsomorphic("eggdd", "addef");
        Assert.assertFalse(isomorphic);
    }

}