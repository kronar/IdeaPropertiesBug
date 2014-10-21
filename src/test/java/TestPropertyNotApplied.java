import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minos on 21.10.14.
 */
public class TestPropertyNotApplied {

    @Test
    public void testPropertyMissing(){
        Assert.assertNull(System.getProperty("id"));
    }
}
