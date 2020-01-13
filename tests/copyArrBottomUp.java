import org.junit.Test;

import static org.junit.Assert.*;

public class copyArrBottomUp {

    private int[] arrayTest;

    /**
     * Test will fail !
     */
    @Test
    public void copyArr() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertArrayEquals(new int[]{ 9, 4, 6, 7, 5} ,Program.copyArr(arrayTest));
    }

    @Test
    public void copyArrNull() {
        arrayTest = null;
        assertNull(Program.copyArr(arrayTest));
    }
}