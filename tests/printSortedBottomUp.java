import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class printSortedBottomUp {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private int[] arrayTest;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printSorted() {
        arrayTest = new int[]{3, 1, 2};
        Program.printSorted(arrayTest);
        assertEquals("3 1 2 \n1 2 3 \n1 2 3 \n", outContent.toString());
    }

    @Test
    public void printSortedNull() {
        arrayTest = null;
        Program.printSorted(arrayTest);
        assertEquals("No array", outContent.toString());
    }
}