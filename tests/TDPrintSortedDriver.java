import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TDPrintSortedDriver {


    @Test
    public void printSortedAllStub() throws IOException {
        printSortedAllStub(new int [] {1,3,2});
    }
    @Test
    public void printSortedNullAllStub() throws IOException {
        printSortedAllStub(null);
    }
    @Test
    public  void printSortedEmptyAllStub() throws IOException {
        printSortedAllStub(new int [] {});
    }
    @Test
    public void printSortedPrintStub() throws IOException {
        printSortedPrintStub(new int [] {1,3,2});
    }
    @Test
    public void printSortedNullPrintStub() throws IOException {
        printSortedPrintStub(null);
    }
    @Test
    public  void printSortedEmptyPrintStub() throws IOException {
        printSortedPrintStub(new int [] {});
    }
    @Test
    public void printSortedProgramPrint() throws IOException {
        printSortedProgramPrint(new int [] {1,3,2});
    }
    @Test
    public void printSortedNullProgramPrint() throws IOException {
        printSortedProgramPrint(null);
    }
    @Test
    public  void printSortedEmptyProgramPrint() throws IOException {
        printSortedProgramPrint(new int [] {});
    }

    @Test
    public void printSortedSortSizeStub() throws IOException {
        printSortedSortSizeStub(new int [] {1,3,2});
    }
    @Test
    public void printSortedNullSortSizeStub() throws IOException {
        printSortedSortSizeStub(null);
    }
    @Test
    public  void printSortedEmptySortSizeStub() throws IOException {
        printSortedSortSizeStub(new int [] {});
    }

    @Test
    public void printSorted(){
        programPrintSorted(new int [] {1,3,2});
    }
    @Test
    public void printSortedNull(){
        programPrintSorted(null);
    }
    @Test
    public  void printSortedEmpty(){
        programPrintSorted(new int [] {});
    }

    private void printSortedAllStub(int[] arr) throws IOException {
        if (arr==null)
            assertTrue(true);
            System.out.println("No array");
        int [] clone = arr.clone();
        clone = TDSortArrayStub.sortArrayStub(clone);
        TDPrintArrStub.printArrStub(arr);
        arr = TDSortArrayStub.sortArrayStub(arr);
        TDPrintArrStub.printArrStub(TDSortArrayStub.sortArrayStub(arr));
        TDPrintArrStub.printArrStub(arr);
        assertArrayEquals(clone, arr);
    }

    private void printSortedPrintStub(int[] arr) throws IOException {
        if (arr==null)
            assertTrue(true);
            System.out.println("No array");
        int [] clone = arr.clone();
        clone = TDSortArrayStub.sortArrayStub(clone);
        TDPrintArrStub.printArrStub(arr);
        arr = TDSortArrayStub.sortArrayAllStub(arr);
        TDPrintArrStub.printArrStub(TDSortArrayStub.sortArrayAllStub(arr));
        TDPrintArrStub.printArrStub(arr);
        assertArrayEquals(clone, arr);
    }

    private void printSortedProgramPrint(int[] arr) throws IOException {
        if (arr==null)
            assertTrue(true);
            System.out.println("No array");
        int [] clone = arr.clone();
        clone = TDSortArrayStub.sortArrayStub(clone);
        Program.printArr(arr);
        arr = TDSortArrayStub.sortArrayAllStub(arr);
        Program.printArr(TDSortArrayStub.sortArrayAllStub(arr));
        Program.printArr(arr);
        assertArrayEquals(clone, arr);
    }

    private void printSortedSortSizeStub(int[] arr) throws IOException {
        if (arr==null)
            assertTrue(true);
            System.out.println("No array");
        int [] clone = arr.clone();
        clone = TDSortArrayStub.sortArrayStub(clone);
        Program.printArr(arr);
        arr = TDSortArrayStub.sortArraySizeStub(arr);
        Program.printArr(TDSortArrayStub.sortArraySizeStub(arr));
        Program.printArr(arr);
        assertArrayEquals(clone, arr);
    }
    private static void programPrintSorted(int[] arr) {
        int [] clone = arr.clone();
        if (arr == null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = Program.sortArray(arr);
        Program.printArr(Program.sortArray(arr));
        Program.printArr(arr);
        assertArrayEquals(clone,arr);
    }


}
