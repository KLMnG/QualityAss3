import org.junit.Test;

import static org.junit.Assert.*;

public class copyArrBottomUp {

    private int[] arrayTest;

    @Test
    public void copyArr() {
        arrayTest = new int[]{ 3, 1, 2, 4 };
        assertArrayEquals(new int[]{ 3, 1, 2, 4 } ,Program.copyArr(arrayTest));
    }

    @Test
    public void copyArrNull() {
        arrayTest = null;
        assertNull(Program.copyArr(arrayTest));
    }
}