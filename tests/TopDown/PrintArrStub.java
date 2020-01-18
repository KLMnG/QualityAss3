package TopDown;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class PrintArrStub {

    public static void printArrStub(int[] arr) throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        StringBuilder out = new StringBuilder();
        for(int val: arr)
            out.append(val+" ");
        out.append("\n");
        outContent.write(out.toString().getBytes());
    }


}
