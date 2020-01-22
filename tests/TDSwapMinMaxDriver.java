import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class TDSwapMinMaxDriver {


    @Test
    public void swapMinMaxAllStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , swapMinMaxAllStub(arrayTest));
    }

    @Test
    public void swapMinMaxEmptyAllStub(){
        int [] arrayTest = new int [] {};
        assertNull(swapMinMaxAllStub(arrayTest));
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
        assertNull(swapMinMaxCopyMaxStub(arrayTest));
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
        assertNull(swapMinMaxCopyStub(arrayTest));
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullCopyStub(){
        int [] arrayTest = null;
        swapMinMaxCopyStub(arrayTest);
    }

    @Test
    public void swapMinMaxSizeStub(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        int [] ans = swapMinMaxSizeStub(arrayTest);
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , ans);
    }

    @Test
    public void swapMinMaxEmptySizeStub(){
        int [] arrayTest = new int [] {};
        assertNull(swapMinMaxSizeStub(arrayTest));
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNullSizeStub(){
        int [] arrayTest = null;
        swapMinMaxSizeStub(arrayTest);
    }

    @Test
    public void swapMinMax(){
        int [] arrayTest = new int [] {1,2,3,4,5,10};
        assertArrayEquals(new int[]{ 10, 2, 3, 4, 5, 1} , Program.swapMinMax(arrayTest));
    }

    @Test
    public void swapMinMaxEmpty(){
        int [] arrayTest = new int [] {};
        assertNull(Program.swapMinMax(arrayTest));
    }
    @Test(expected = NullPointerException.class)
    public void swapMinMaxNull(){
        int [] arrayTest = null;
        Program.swapMinMax(arrayTest);
    }

    private int[] swapMinMaxAllStub(int[] arr) {
        int[] res = TDCopyArrStub.copyArrStub(arr);
        assertArrayEquals(res,arr);
        int minInd = TDMinValueIndexStub.minValueIndexStub(arr);
        int maxInd = TDMaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyMaxStub(int[] arr) {
        int[] res = TDCopyArrStub.copyArrStub(arr);
        assertArrayEquals(res,arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = TDMaxValueIndexStub.maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    private int[] swapMinMaxCopyStub(int[] arr) {
        int[] res = TDCopyArrStub.copyArrStub(arr);
        assertArrayEquals(res,arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Program.maxValueIndex(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }


    private int[] swapMinMaxSizeStub(int[] arr) {
        int[] res = TDCopyArrStub.copyArrAllStub(arr);
        System.out.println(Arrays.toString(res));
        assertArrayEquals(res,arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Program.maxValueIndex(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

}
