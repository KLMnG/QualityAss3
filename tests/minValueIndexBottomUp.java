import org.junit.Test;

import static org.junit.Assert.*;

public class minValueIndexBottomUp {

    private int[]arrayTest;

    @Test
    public void minValueIndex() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(1,Program.minValueIndex(arrayTest));
    }

    @Test
    public void minValueIndexEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(-1,Program.minValueIndex(arrayTest));
    }
}