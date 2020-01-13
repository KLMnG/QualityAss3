import org.junit.Test;

import static org.junit.Assert.*;

public class swapMinMaxBottomUp {

    private int[] arrayTest;

    @Test
    public void swapMinMax() {
        // 2, 5, 7 -> 7, 5, 2 ?
        arrayTest = new int[]{2, 5, 7};
        assertArrayEquals(new int[]{7, 5, 2}, Program.swapMinMax(arrayTest));
        // 2, 5 ,7 -> 7, 5, 7 ?
        assertArrayEquals(new int[]{7, 5, 7}, Program.swapMinMax(arrayTest));

    }

    @Test
    public void swapMinMaxEmpty() {
        arrayTest = new int[]{};
        assertNull(Program.swapMinMax(arrayTest));
    }
}