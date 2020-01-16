import org.junit.Test;

import static org.junit.Assert.*;

public class maxValueIndexBottomUp {

    private int[]arrayTest;

    @Test
    public void maxValueIndex() {
        arrayTest = new int[]{ 3, 4, 6, 7, 5};
        assertEquals(3,Program.maxValueIndex(arrayTest));
    }

    @Test
    public void maxValueIndexDuplicates() {
        arrayTest = new int[]{ 3, 7, 6, 7, 5};
        assertEquals(1,Program.maxValueIndex(arrayTest));
    }

    @Test
    public void maxValueIndexEmptyArray() {
        arrayTest = new int[]{};
        assertEquals(-1,Program.maxValueIndex(arrayTest));
    }

}