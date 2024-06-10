import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFactorial extends Assert {
    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {5, 120},
                {5, 121}
        };
    }

    @Test(dataProvider = "data")
    public void testFactorial(int factorial, int exp) {
        int actFactorial = Factorial.getFactorial(factorial);
        assertEquals(actFactorial, exp);
    }
}