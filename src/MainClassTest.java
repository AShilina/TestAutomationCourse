import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("The number is not more than 45", MainClass.getClassNumber() > 45);
    }
}
