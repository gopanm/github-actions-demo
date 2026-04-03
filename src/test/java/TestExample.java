import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample {

    @Test
    public void testPass() {
        System.out.println("Test is running...");
        Assert.assertTrue(true);
    }
}
