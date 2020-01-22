import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TDMergeDriver {


    @Test
    public void mergeAllStub() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, merged);
        assertEquals(6, merged.length);
    }

    @Test
    public void mergeFirstEmptyAllStub() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{ 2, 4, 6}, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSeccondEmptyAllStub() {
        int [] firstArray = new int[]{2, 4, 6};
        int [] secondArray = new int[]{};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{ 2, 4, 6}, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSeccondBothAllStub() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeFirstEmptySeccondNullAllStub() {
        int [] firstArray = new int[]{};
        int [] secondArray = null;
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeFirstNullSeccondEmptyAllStub() {
        int [] firstArray = null;
        int [] secondArray = new int[]{};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeBothNullmergeAllStub() {
        int [] firstArray = null;
        int [] secondArray = null;
        assertNull(mergeAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeSecondNullmergeAllStub() {
        int [] firstArray = new int[]{4, 3, 1, 2};
        int [] secondArray = null;
        assertArrayEquals(new int[]{1, 2, 3, 4}, mergeAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeFirstNullmergeAllStub() {
        int [] firstArray = null;
        int [] secondArray = new int[]{4, 3, 1, 2};
        assertArrayEquals(new int[]{1, 2, 3, 4}, mergeAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeSortAllStub() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, merged);
        assertEquals(6, merged.length);
    }

    @Test
    public void mergeSortAllStubFirstEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{2, 4, 6}, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSortAllStubSecondEmpty() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{};
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{1, 3, 5 }, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSortAllStubBothEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{};
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeSortAllStubFirstEmptySecondNull() {
        int [] firstArray = new int[]{};
        int [] secondArray = null;
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeSortAllStubFirstNullSecondEmpty() {
        int [] firstArray = null;
        int [] secondArray = new int[]{};
        int [] merged = mergeSortAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeBothNullmergeSortAllStub() {
        int [] firstArray = null;
        int [] secondArray = null;
        assertNull(mergeSortAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeSecondNullmergeSortAllStub() {
        int [] firstArray = new int[]{4, 3, 1, 2};
        int [] secondArray = null;
        assertArrayEquals(new int[]{1, 2, 3, 4}, mergeSortAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeFirstNullmergeSortAllStub() {
        int [] firstArray = null;
        int [] secondArray = new int[]{4, 3, 1, 2};
        assertArrayEquals(new int[]{1, 2, 3, 4}, mergeSortAllStub(firstArray, secondArray));
    }

    @Test
    public void mergeSortSizeStub() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        System.out.println(Arrays.toString(merged));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, merged);
        assertEquals(6, merged.length);
    }
    @Test
    public void mergeSortSizeStubFirstEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        System.out.println(Arrays.toString(merged));
        assertArrayEquals(new int[]{2,4,6}, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSortSizeStubSecondEmpty() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{};
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        System.out.println(Arrays.toString(merged));
        assertArrayEquals(new int[]{1, 3, 5}, merged);
        assertEquals(3, merged.length);
    }

    @Test
    public void mergeSortSizeStubBothEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{};
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeSortSizeStubFirstEmptySecondNull() {
        int [] firstArray = new int[]{};
        int [] secondArray = null;
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeSortSizeStubFirstNullSecondEmpty() {
        int [] firstArray = null;
        int [] secondArray = new int[]{};
        int [] merged = mergeSortSizeStub(firstArray, secondArray);
        assertArrayEquals(new int[]{}, merged);
        assertEquals(0, merged.length);
    }

    @Test
    public void mergeBothNullmergeSortSizeStub() {
        int [] firstArray = null;
        int [] secondArray = null;
        assertNull(mergeSortSizeStub(firstArray, secondArray));
    }

    @Test
    public void mergeSecondNullmergeSortSizeStub() {
        int [] firstArray = new int[]{4, 3, 1, 2};
        int [] secondArray = null;
        int [] ans = mergeSortSizeStub(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ans);
    }

    @Test
    public void mergeFirstNullmergeSortSizeStub() {
        int [] firstArray = null;
        int [] secondArray = new int[]{4, 3, 1, 2};
        int [] ans = mergeSortSizeStub(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ans);
    }


    private static int[] mergeAllStub(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return TDSortArrayStub.sortArrayStub(ar2);
        if (ar2==null) return TDSortArrayStub.sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return TDSortArrayStub.sortArrayStub(res);
    }

    private static int[] mergeSortAllStub(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return TDSortArrayStub.sortArrayAllStub(ar2);
        if (ar2==null) return TDSortArrayStub.sortArrayAllStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return TDSortArrayStub.sortArrayAllStub(res);
    }

    private static int[] mergeSortSizeStub(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return TDSortArrayStub.sortArraySizeStub(ar2);
        if (ar2==null) return TDSortArrayStub.sortArraySizeStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return TDSortArrayStub.sortArraySizeStub(res);
    }

    @Test
    public void merge() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        int [] ans = Program.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ans);
        assertEquals(6, ans.length);
    }

    @Test
    public void mergeFirstEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{2, 4, 6};
        int [] ans = Program.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{2, 4, 6}, ans);
        assertEquals(3, ans.length);
    }

    @Test
    public void mergeSecondEmpty() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{};
        int [] ans = Program.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 3, 5}, ans);
        assertEquals(3, ans.length);
    }

    @Test
    public void mergeBothEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{};
        assertArrayEquals(new int[]{}, Program.merge(firstArray, secondArray));
        assertEquals(0, Program.merge(firstArray, secondArray).length);
    }

    @Test
    public void mergeFirstEmptySecondNull() {
        int [] firstArray = new int[]{};
        int [] secondArray = null;
        assertArrayEquals(new int[]{}, Program.merge(firstArray, secondArray));
        assertEquals(0, Program.merge(firstArray, secondArray).length);
    }

    @Test
    public void mergeFirstNullSecondEmpty() {
        int [] firstArray = new int[]{};
        int [] secondArray = new int[]{};
        assertArrayEquals(new int[]{}, Program.merge(firstArray, secondArray));
        assertEquals(0, Program.merge(firstArray, secondArray).length);
    }

    @Test
    public void mergeBothNull() {
        int [] firstArray = null;
        int [] secondArray = null;
        assertNull(Program.merge(firstArray, secondArray));
    }

    @Test
    public void mergeSecondNull() {
        int [] firstArray = new int[]{4, 3, 1, 2};
        int [] secondArray = null;
        int [] ans = Program.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ans);
    }

    @Test
    public void mergeFirstNull() {
        int [] firstArray = null;
        int [] secondArray = new int[]{4, 3, 1, 2};
        int [] ans = Program.merge(firstArray, secondArray);
        System.out.println(Arrays.toString(ans));
        assertArrayEquals(new int[]{1, 2, 3, 4}, ans);
    }
}
