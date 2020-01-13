import org.junit.Test;

import static org.junit.Assert.*;

public class maxValueBottomUp {

    private int[]arrayTest;

    /**
     * Test will fail !
     * maxValueIndex return the value instead of the index therefore array[index] return wrong answer
     */
    @Test
    public void maxValue() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(9,Program.maxValue(arrayTest));
    }

    /**
     * Test will fail !
     * maxValueIndex appears in the function instead minValueIndex
     */
    @Test
    public void maxValueDuplicates() {
        arrayTest = new int[]{ 3, 7, 6, 7, 5};
        assertEquals(7,Program.maxValue(arrayTest));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void maxValueEmpty() {
        arrayTest = new int[]{};
        assertEquals(9,Program.maxValue(arrayTest));
    }
}