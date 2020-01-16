import org.junit.Test;

import static org.junit.Assert.*;

public class minValueBottomUp {

    private int[]arrayTest;

    @Test
    public void minValue() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(4,Program.minValue(arrayTest));
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void minValueEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(9,Program.minValue(arrayTest));
    }
}