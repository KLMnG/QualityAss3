package TopDown;

import org.junit.Test;

import java.io.IOException;

public class PrintSortedDriver {


    @Test
    public void printSortedAllStub() throws IOException {
        printSortedAllStub(new int [] {1,2,3});
    }
    @Test(expected = NullPointerException.class)
    public void printSortedNullAllStub() throws IOException {
        printSortedAllStub(null);
    }
    @Test
    public  void printSortedEmptyAllStub() throws IOException {
        printSortedAllStub(new int [] {});
    }
    @Test
    public void printSortedPrintStub() throws IOException {
        printSortedPrintStub(new int [] {1,2,3});
    }
    @Test(expected = NullPointerException.class)
    public void printSortedNullPrintStub() throws IOException {
        printSortedPrintStub(null);
    }
    @Test
    public  void printSortedEmptyPrintStub() throws IOException {
        printSortedPrintStub(new int [] {});
    }

    @Test
    public void printSortedSortSizeStub() throws IOException {
        printSortedSortSizeStub(new int [] {1,2,3});
    }
    @Test(expected = NullPointerException.class)
    public void printSortedNullSortSizeStub() throws IOException {
        printSortedSortSizeStub(null);
    }
    @Test
    public  void printSortedEmptySortSizeStub() throws IOException {
        printSortedSortSizeStub(new int [] {});
    }

    @Test
    public void printSorted(){
        Program.printSorted(new int [] {1,2,3});
    }
    @Test(expected = NullPointerException.class)
    public void printSortedNull(){
        Program.printSorted(null);
    }
    @Test
    public  void printSortedEmpty(){
        Program.printSorted(new int [] {});
    }

    private void printSortedAllStub(int[] arr) throws IOException {
        if (arr==null)
            System.out.println("No array");
        PrintArrStub.printArrStub(arr);
        arr = SortArrayStub.sortArrayStub(arr);
        PrintArrStub.printArrStub(SortArrayStub.sortArrayStub(arr));
        PrintArrStub.printArrStub(arr);
    }

    private void printSortedPrintStub(int[] arr) throws IOException {
        if (arr==null)
            System.out.println("No array");
        PrintArrStub.printArrStub(arr);
        arr = SortArrayStub.sortArrayAllStub(arr);
        PrintArrStub.printArrStub(SortArrayStub.sortArrayAllStub(arr));
        PrintArrStub.printArrStub(arr);
    }

    private void printSortedSortSizeStub(int[] arr) throws IOException {
        if (arr==null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = SortArrayStub.sortArrayAllStub(arr);
        Program.printArr(SortArrayStub.sortArrayAllStub(arr));
        Program.printArr(arr);
    }



}
