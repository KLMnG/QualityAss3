import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BUPrintArrDriver {

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
    public void printArr() {
        arrayTest = new int[]{1, 2, 3};
        Program.printArr(arrayTest);
        assertEquals("1 2 3 \r\n", outContent.toString());
    }

    @Test
    public void printArrEmpty() {
        arrayTest = new int[]{};
        Program.printArr(arrayTest);
        assertEquals("\r\n", outContent.toString());
    }

    @Test
            (expected = NullPointerException.class)
    public void printArrNull() {
        arrayTest = null;
        Program.printArr(arrayTest);
    }
}