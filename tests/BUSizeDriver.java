import org.junit.Test;

import static org.junit.Assert.*;

public class BUSizeDriver {


    @Test
    public void sizeRegularTest() {
        int[] arrayTest = new int[5];
        assertEquals(5, Program.size(arrayTest));
    }

    @Test
    public void sizeZeroTest() {
        int[] arrayTest = new int[0];
        assertEquals(0, Program.size(arrayTest));
    }

    @Test
            (expected = NullPointerException.class)
    public void sizeNullTest() {
        int[] arrayTest = null;
        Program.size(arrayTest);

    }

}