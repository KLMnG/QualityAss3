import org.junit.Test;

import static org.junit.Assert.*;

public class sumMinMaxBottomUp {

    private int[] testArray;

    /**
     * Test will fail !
     */
    @Test
    public void sumMinMax() {
        testArray = new int[]{3, 1, 5};
        assertEquals(6,Program.sumMinMax(testArray));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void sumMinMaxEmpty() {
        testArray = new int[]{};
        assertEquals(-2,Program.sumMinMax(testArray));
    }
}