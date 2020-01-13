import org.junit.Test;

import static org.junit.Assert.*;

public class minValueIndexBottomUp {

    private int[]arrayTest;

    /**
     *  Test will fail !
     *  because the function should return the index of the minimum value, it returns the minimum value
     */
    @Test
    public void minValueIndex() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(1,Program.minValueIndex(arrayTest));
    }

    /**
     *  Test will fail !
     *  because the function should return check if the array is empty and not null
     */
    @Test
    public void minValueIndexEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(-1,Program.minValueIndex(arrayTest));
    }
}