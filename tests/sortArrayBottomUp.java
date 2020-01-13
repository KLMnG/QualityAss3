import org.junit.Test;

import static org.junit.Assert.*;

public class sortArrayBottomUp {

    private int[] arrayTest;

    @Test
    public void sortArray() {
        arrayTest = new int[]{2, 5, 1, 4, 6, 3};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.sortArray(arrayTest));
    }

    @Test
    public void sortArrayNull() {
        arrayTest = null;
        assertNull(Program.sortArray(arrayTest));
    }
}