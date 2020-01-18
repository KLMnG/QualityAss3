package TopDown;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSortedDriver {

    @Test
    public void isSortedAllStubFalse() {
        assertFalse(isSortedAllStub(new int [] {1,3,2}));
    }

    @Test
    public void isSortedAllStubTrue() {
        assertTrue(isSortedAllStub(new int [] {1,2,3}));
    }

    @Test(expected = NoSuchElementException.class)
    public void isSortedAllStubEmpty()
    {
        isSortedAllStub(new int [] {});
    }

    @Test(expected = NullPointerException.class)
    public void isSortedAllStubNull() {
        isSortedAllStub(null);
    }

    @Test
    public void isSortedEqualsStubFalse() {
        int [] arr = {1,3,2};
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        assertFalse(EqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test
    public void isSortedEqualsStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test(expected = NoSuchElementException.class)
    public void isSortedEqualsStubEmpty() {
        int [] arr = {};
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        EqualsArraysStub.equalsArraysStub(arr, sorted);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedEqualsStubNull() {
        int [] arr = null;
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test
    public void isSortedStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test(expected = NoSuchElementException.class)
    public void isSortedStubEmpty() {
        int [] arr = {};
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        EqualsArraysStub.equalsArraysSizeStub(arr, sorted);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedStubNull() {
        int [] arr = null;
        int[] sorted = SortArrayStub.sortArrayAllStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test
    public void isSortedSortSizeStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = SortArrayStub.sortArraySizeStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test(expected = NoSuchElementException.class)
    public void isSortedSortSizeStubEmpty() {
        int [] arr = {};
        int[] sorted = SortArrayStub.sortArraySizeStub(arr);
        EqualsArraysStub.equalsArraysSizeStub(arr, sorted);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedSortSizeStubNull() {
        int [] arr = null;
        int[] sorted = SortArrayStub.sortArraySizeStub(arr);
        assertTrue(EqualsArraysStub.equalsArraysSizeStub(arr, sorted));
    }

    @Test
    public void isSortedFalse() {
        int [] arr = {1,3,2};
        assertFalse(Program.isSorted(arr));
    }

    @Test
    public void isSortedTrue() {
        int [] arr = {1,2,3};
        assertTrue(Program.isSorted(arr));
    }

    @Test(expected = NoSuchElementException.class)
    public void isSortedEmpty() {
        int [] arr = {};
        Program.isSorted(arr);
    }

    @Test(expected = NullPointerException.class)
    public void isSortedNull() {
        int [] arr = null;
        Program.isSorted(arr);
    }

    private boolean isSortedAllStub(int [] arr) {
        int [] sorted = SortArrayStub.sortArrayStub(arr);
        boolean isSorted = EqualsArraysStub.equalsArraysStub(arr,sorted);
        return isSorted;
    }

}
