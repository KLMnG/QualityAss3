package TopDown;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MergeDriver {


    @Test
    public void mergeAllStub() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        int [] merged = mergeAllStub(firstArray, secondArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, merged);
        assertEquals(6, merged.length);
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

    private static int[] mergeAllStub(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return SortArrayStub.sortArrayStub(ar2);
        if (ar2==null) return SortArrayStub.sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return SortArrayStub.sortArrayStub(res);
    }

    @Test
    public void merge() {
        int [] firstArray = new int[]{1, 3, 5};
        int [] secondArray = new int[]{2, 4, 6};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Program.merge(firstArray, secondArray));
        assertEquals(6, Program.size(Program.merge(firstArray, secondArray)));
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
        assertArrayEquals(new int[]{1, 2, 3, 4}, Program.merge(firstArray, secondArray));
    }

    @Test
    public void mergeFirstNull() {
        int [] firstArray = null;
        int [] secondArray = new int[]{4, 3, 1, 2};
        assertArrayEquals(new int[]{1, 2, 3, 4}, Program.merge(firstArray, secondArray));
    }
}
