import org.junit.Test;

import static org.junit.Assert.*;

public class SumMinMaxDriver {

    private int[] testArray;


    @Test
    public void sumMinMax() {
        testArray = new int[]{3, 1, 5};
        assertEquals(6,Program.sumMinMax(testArray));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void sumMinMaxEmpty() {
        testArray = new int[]{};
        Program.sumMinMax(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNull() {
        testArray = null;
        Program.sumMinMax(testArray);
    }
}