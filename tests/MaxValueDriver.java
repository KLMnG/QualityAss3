import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueDriver {

    private int[] arrayTest;


    @Test
    public void maxValue() {
        arrayTest = new int[]{9, 4, 6, 7, 5};
        assertEquals(9, Program.maxValue(arrayTest));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueEmpty() {
        arrayTest = new int[]{};
        Program.maxValue(arrayTest);
    }

    @Test(expected = NullPointerException.class)
    public void maxValueNull() {
        arrayTest = null;
        Program.maxValue(arrayTest);
    }
}