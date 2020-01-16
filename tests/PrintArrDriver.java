import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PrintArrDriver {

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