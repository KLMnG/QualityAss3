import org.junit.Test;

import static org.junit.Assert.*;

public class IsSortedDriver {

    private int[] arrayTest;

    @Test
    public void isSorted() {
        arrayTest = new int[]{1, 2, 3, 4};
        assertTrue(Program.isSorted(arrayTest));
    }

    @Test
    public void isSortedFalse() {
        arrayTest = new int[]{4, 2, 3, 1};
        assertFalse(Program.isSorted(arrayTest));
    }

    @Test
    public void isSortedEmpty() {
        arrayTest = new int[]{};
        assertTrue(Program.isSorted(arrayTest));
    }

    @Test
    public void isSortedNull() {
        arrayTest = null;
        assertTrue(Program.isSorted(arrayTest));
    }
}