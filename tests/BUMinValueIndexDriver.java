import org.junit.Test;

import static org.junit.Assert.*;

public class BUMinValueIndexDriver {

    private int[]arrayTest;

    /**
     *  Test will fail !
     *  because the function should return the index of the minimum value, it returns the minimum value
     */
    //fixed
    @Test
    public void minValueIndex() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(1,Program.minValueIndex(arrayTest));
    }

    /**
     *  Test will fail !
     *  because the function should return check if the array is empty and not null
     */
    //fixed
    @Test
    public void minValueIndexEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(-1,Program.minValueIndex(arrayTest));
    }

    @Test
    public void minValueIndexNullArray() {
        arrayTest = null;
        assertEquals(-1, Program.minValueIndex(arrayTest));
    }

    }