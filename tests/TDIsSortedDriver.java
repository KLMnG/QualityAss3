import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TDIsSortedDriver {

    @Test
    public void isSortedAllStubFalse() {
        assertFalse(isSortedAllStub(new int [] {1,3,2}));
    }

    @Test
    public void isSortedAllStubTrue() {
        assertTrue(isSortedAllStub(new int [] {1,2,3}));
    }

    @Test
    public void isSortedAllStubEmpty()
    {
        assertTrue(isSortedAllStub(new int [] {}));
    }

    @Test(expected = NullPointerException.class)
    public void isSortedAllStubNull() {
        isSortedAllStub(null);
    }

    @Test
    public void isSortedEqualsStubFalse() {
        int [] arr = {1,3,2};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        assertFalse(TDEqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test
    public void isSortedEqualsStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        assertTrue(TDEqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test
    public void isSortedEqualsStubEmpty() {
        int [] arr = {};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        assertTrue(TDEqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test(expected = NullPointerException.class)
    public void isSortedEqualsStubNull() {
        int [] arr = null;
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysStub(arr, sorted);
        System.out.println(ans);
    }

    @Test
    public void isSortedStubFalse() {
        int [] arr = {1,3,2};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
        assertFalse(ans);
    }

    @Test
    public void isSortedStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        assertTrue(TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test
    public void isSortedStubEmpty() {
        int [] arr = {};
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
        assertTrue(ans);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedStubNull() {
        int [] arr = null;
        int[] sorted = TDSortArrayStub.sortArrayAllStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
    }

    @Test
    public void isSortedSortSizeStubFalse() {
        int [] arr = {1,3,2};
        int[] sorted = TDSortArrayStub.sortArraySizeStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
        assertFalse(ans);
    }

    @Test
    public void isSortedSortSizeStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = TDSortArrayStub.sortArraySizeStub(arr);
        assertTrue(TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test
    public void isSortedSortSizeStubEmpty() {
        int [] arr = {};
        int[] sorted = TDSortArrayStub.sortArraySizeStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
        assertTrue(ans);

    }

    @Test(expected = NullPointerException.class)
    public void isSortedSortSizeStubNull() {
        int [] arr = null;
        int[] sorted = TDSortArrayStub.sortArraySizeStub(arr);
        boolean ans = TDEqualsArraysStub.equalsArraysSizeStub(arr, sorted);
        System.out.println(ans);
    }

    @Test
    public void isSortedFalse() {
        int [] arr = {1,3,2};
        boolean ans = Program.isSorted(arr);
        System.out.println(ans);
        assertFalse(ans);
    }

    @Test
    public void isSortedTrue() {
        int [] arr = {1,2,3};
        assertTrue(Program.isSorted(arr));
    }

    @Test
    public void isSortedEmpty() {
        int [] arr = {};
        boolean ans = Program.isSorted(arr);
        System.out.println(ans);
        assertTrue(ans);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedNull() {
        int [] arr = null;
        boolean ans = Program.isSorted(arr);
        System.out.println(ans);
        Program.isSorted(arr);
    }

    private boolean isSortedAllStub(int [] arr) {
        int [] sorted = TDSortArrayStub.sortArrayStub(arr);
        boolean isSorted = TDEqualsArraysStub.equalsArraysStub(arr,sorted);
        return isSorted;
    }

}
