import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("The string doesn't contain 'hello' or 'Hello'", getClassString().contains("hello") || getClassString().contains("Hello"));
    }
}
