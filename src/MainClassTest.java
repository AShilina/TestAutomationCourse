import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertEquals("The number is not 14", 14, MainClass.getLocalNumber());
    }
}
