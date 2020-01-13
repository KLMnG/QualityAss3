import org.junit.Test;

import static org.junit.Assert.*;

public class maxValueIndexBottomUp {

    private int[]arrayTest;

    /**
     *  Test will fail !
     *  because the function should return the index of the minimum value, it returns the minimum value
     */
    @Test
    public void maxValueIndex() {
        arrayTest = new int[]{ 9, 4, 6, 7, 5};
        assertEquals(0,Program.maxValueIndex(arrayTest));
    }

    @Test
    public void maxValueIndexEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(-1,Program.maxValueIndex(arrayTest));
    }

}