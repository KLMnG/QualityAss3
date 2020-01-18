import org.junit.Test;

import static org.junit.Assert.*;

public class BUSortArrayDriver {

    private int[] arrayTest;

    @Test
    public void sortArray() {
        arrayTest = new int[]{2, 5, 1, 4, 6, 3};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.sortArray(arrayTest));
    }

    @Test
    public void sortEmptyArray() {
        arrayTest = new int[]{};
        assertArrayEquals(new int[]{}, Program.sortArray(arrayTest));
    }

    @Test
    public void sortArrayNull() {
        arrayTest = null;
        assertNull(Program.sortArray(arrayTest));
    }
}