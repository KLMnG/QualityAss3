import org.junit.Test;

import static org.junit.Assert.*;

public class sizeBottomUp {

    @Test
    public void sizeTest() {
        int[]arrayTest = new int[5];
        assertEquals(5,Program.size(arrayTest));
    }
}