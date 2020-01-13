import org.junit.Test;

import static org.junit.Assert.*;

public class mergeBottomUp {

    private int[] firstArray;
    private int[] secondArray;

    @Test
    public void merge() {
        firstArray = new int[]{1, 3, 5};
        secondArray = new int[]{2, 4, 6};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(firstArray, secondArray));
        assertEquals(6, Program.size(Program.merge(firstArray, secondArray)));
    }

    @Test
    public void mergeBothNull() {
        firstArray = null;
        secondArray = null;
        assertNull(Program.merge(firstArray, secondArray));
    }

    @Test
    public void mergeSecondNull() {
        firstArray = new int[]{4, 3, 1, 2};
        secondArray = null;
        assertArrayEquals(new int[]{1, 2, 3, 4},Program.merge(firstArray, secondArray));
    }

    @Test
    public void mergeFirstNull() {
        firstArray = null;
        secondArray = new int[]{4, 3, 1, 2};
        assertArrayEquals(new int[]{1, 2, 3, 4},Program.merge(firstArray, secondArray));
    }
}