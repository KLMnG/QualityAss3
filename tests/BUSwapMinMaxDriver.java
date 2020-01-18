import org.junit.Test;

import static org.junit.Assert.*;

public class BUSwapMinMaxDriver {

    private int[] arrayTest;

    @Test
    public void swapMinMax() {
        arrayTest = new int[]{2, 5, 4, 7};
        assertArrayEquals(new int[]{7, 5, 4, 2}, Program.swapMinMax(arrayTest));
    }

    //fixed
    @Test
    public void swapMinMaxEmpty() {
        arrayTest = new int[]{};
        assertNull(Program.swapMinMax(arrayTest));
    }

    //fixed
    @Test
    public void swapMinMaxNull() {
        arrayTest = null;
        assertNull(Program.swapMinMax(arrayTest));
    }
}