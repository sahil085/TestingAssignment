import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SubtractionTest {

    private Subtraction obj = new Subtraction();

    @Test
    public void subtractionOfInts() {

        Assert.assertEquals(obj.subtract(15, 56), -41);
        Assert.assertNotEquals(obj.subtract(35, 25), -10);
    }

    @Ignore
    public void subtractionOfFloats() {
        float num1 = 15.5f;
        float num2 = 126.0f;
        Assert.assertEquals(obj.subtract(num1, num2), 141.9f, 0.5);
    }

    @Test
    public void subtractionOfDoubles() {
        double num1 = 15.5;
        double num2 = 126.0;
        Assert.assertEquals(obj.subtract(num1, num2), 141.9, 0.5);
        Assert.assertNotEquals(obj.subtract(num1, num2), 142.5);

    }

}
