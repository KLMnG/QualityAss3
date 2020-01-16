package TopDown;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SwapMinMaxDriver {



    @Test
    public void swapMinMaxAllStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , swapMinMaxAllStub(arrayTest));
    }

    @Test
    public void swapMinMaxEmptyAllStub(){
        int [] arrayTest = new int [] {};
        assertEquals(-1,swapMinMaxAllStub(arrayTest));
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

    @Test
    public void swapMinMaxEmptyCopyMaxStub(){
        int [] arrayTest = new int [] {};
        assertEquals(-1,swapMinMaxCopyMaxStub(arrayTest));
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

    @Test
    public void swapMinMaxEmptyCopyStub(){
        int [] arrayTest = new int [] {};
        assertEquals(-1,swapMinMaxCopyStub(arrayTest));
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullCopyStub(){
        int [] arrayTest = null;
        swapMinMaxCopyStub(arrayTest);
    }

    private int[] swapMinMaxAllStub(int[] arr) {
        int[] res = CopyArrStub.coppArrStub(arr);
        int minInd = MinValueIndexStub.minValueIndexStub(arr);
        int maxInd = MaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyMaxStub(int[] arr) {
        int[] res = CopyArrStub.coppArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = MaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyStub(int[] arr) {
        int[] res = CopyArrStub.coppArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Program.maxValueIndex(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

}
