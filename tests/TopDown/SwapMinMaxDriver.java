package TopDown;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertArrayEquals;

public class SwapMinMaxDriver {


    @Test
    public void swapMinMaxAllStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , swapMinMaxAllStub(arrayTest));
    }

    @Test(expected = NoSuchElementException.class)
    public void swapMinMaxEmptyAllStub(){
        int [] arrayTest = new int [] {};
        swapMinMaxAllStub(arrayTest);
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullAllStub(){
        int [] arrayTest = null;
        swapMinMaxAllStub(arrayTest);
    }

    @Test
    public void swapMinMaxCopyMaxStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , swapMinMaxCopyMaxStub(arrayTest));
    }

    @Test(expected = NoSuchElementException.class)
    public void swapMinMaxEmptyCopyMaxStub(){
        int [] arrayTest = new int [] {};
        swapMinMaxCopyMaxStub(arrayTest);
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullCopyMaxStub(){
        int [] arrayTest = null;
        swapMinMaxCopyMaxStub(arrayTest);
    }

    @Test
    public void swapMinMaxCopyStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , swapMinMaxCopyStub(arrayTest));
    }

    @Test(expected = NoSuchElementException.class)
    public void swapMinMaxEmptyCopyStub(){
        int [] arrayTest = new int [] {};
        swapMinMaxCopyStub(arrayTest);
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullCopyStub(){
        int [] arrayTest = null;
        swapMinMaxCopyStub(arrayTest);
    }

    @Test
    public void swapMinMax(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , Program.swapMinMax(arrayTest));
    }

    @Test(expected = NoSuchElementException.class)
    public void swapMinMaxEmpty(){
        int [] arrayTest = new int [] {};
        Program.swapMinMax(arrayTest);
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNull(){
        int [] arrayTest = null;
        Program.swapMinMax(arrayTest);
    }

    private int[] swapMinMaxAllStub(int[] arr) {
        int[] res = CopyArrStub.copyArrStub(arr);
        int minInd = MinValueIndexStub.minValueIndexStub(arr);
        int maxInd = MaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyMaxStub(int[] arr) {
        int[] res = CopyArrStub.copyArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = MaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyStub(int[] arr) {
        int[] res = CopyArrStub.copyArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Program.maxValueIndex(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

}
