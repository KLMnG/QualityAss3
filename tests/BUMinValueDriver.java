import org.junit.Test;

import static org.junit.Assert.*;

public class BUMinValueDriver {

    private int[] arrayTest;

    //fixed
    @Test
    public void minValue() {
        arrayTest = new int[]{9, 4, 6, 7, 5};
        assertEquals(4, Program.minValue(arrayTest));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void minValueEmpty() {
        arrayTest = new int[]{};
        Program.minValue(arrayTest);
    }

    @Test(expected = NullPointerException.class)
    public void minValueNull() {
        arrayTest = null;
        Program.minValue(arrayTest);
    }
}
