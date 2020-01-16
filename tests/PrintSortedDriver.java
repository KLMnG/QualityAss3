import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PrintSortedDriver {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private int[] arrayTest;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void printSorted() {
        arrayTest = new int[]{1, 3, 2};
        Program.printSorted(arrayTest);
        assertEquals("1 3 2 \r\n1 2 3 \r\n1 3 2 \r\n", outContent.toString());
    }

    @Test
    public void printSortedEmpty() {
        arrayTest = new int[]{};
        Program.printSorted(arrayTest);
        assertEquals("\r\n\r\n\r\n", outContent.toString());
    }

    @Test
    public void printSortedNull() {
        arrayTest = null;
        Program.printSorted(arrayTest);
        assertEquals("No array", outContent.toString());

    }


}