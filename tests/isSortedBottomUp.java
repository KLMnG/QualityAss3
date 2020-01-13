import org.junit.Test;

import static org.junit.Assert.*;

public class isSortedBottomUp {

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
}