import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class AdditionTest {

    private Addition obj = new Addition();

    @Test
    public void sumOfInts() {

        Assert.assertEquals(obj.sum(15, 56), 71);
        Assert.assertEquals(obj.sum(15, 25), 40);
    }
    @Test(expected = ArithmeticException.class)
    public void division(){
        Assert.assertEquals(obj.divide(15,0),15);
    }

    @Test
    public void sumOfFloats() {
        float num1 = 15.5f;
        float num2 = 126.0f;
        Assert.assertEquals(obj.sum(num1, num2), 141.9f, 0.5);
    }

    @Test
    public void sumOfDoubles() {
        double num1 = 15.5;
        double num2 = 126.0;
        Assert.assertEquals(obj.sum(num1, num2), 141.9, 0.5);
        Assert.assertNotEquals(obj.sum(num1, num2), 142.5);

    }

    @Test
    public void sumOfString() {
        Assert.assertEquals(obj.sum("chunks", " gupta"), "chunks gupta");
    }

    @Test
    public void listSum() {
        List list1 = Arrays.asList(1, 2, 3);
        List list2 = Arrays.asList(4, 5, 6);

        Assert.assertEquals(obj.sum(list1, list2), Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}

