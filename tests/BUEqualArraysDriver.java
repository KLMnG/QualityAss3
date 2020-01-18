import org.junit.Test;

import static org.junit.Assert.*;

public class BUEqualArraysDriver {

    private int[] firstArray;
    private int[] secondArray;

    @Test
    public void equalArrays() {
        firstArray = new int[]{4, 2, 5, 1};
        secondArray = new int[]{4, 2, 5, 1};
        assertTrue(Program.equalArrays(firstArray, secondArray));
    }

    //fixed
    @Test
    public void equalEmptyArrays() {
        firstArray = new int[]{};
        secondArray = new int[]{};
        assertTrue(Program.equalArrays(firstArray, secondArray));
    }

    //fixed
    @Test
    public void equalArraySizeDifferentArray() {
        firstArray = new int[]{4, 2, 5, 1};
        secondArray = new int[]{4, 3, 5, 1};
        assertFalse(Program.equalArrays(firstArray, secondArray));
    }

    @Test
    public void equalArraysDifferentSize() {
        firstArray = new int[]{4, 2, 5, 1};
        secondArray = new int[]{4, 3, 5, 1, 6};
        assertFalse(Program.equalArrays(firstArray, secondArray));
    }

    @Test
    public void equalArraysFirstArrayNull() {
        firstArray = null;
        secondArray = new int[]{4, 2, 5, 1};
        assertFalse(Program.equalArrays(firstArray, secondArray));
    }

    @Test
    public void equalArraysSecondArrayNull() {
        firstArray = new int[]{4, 2, 5, 1};
        secondArray = null;
        assertFalse(Program.equalArrays(firstArray, secondArray));
    }

    @Test
    public void equalArraysNull() {
        firstArray = null;
        secondArray = null;
        assertTrue(Program.equalArrays(firstArray, secondArray));
    }
}