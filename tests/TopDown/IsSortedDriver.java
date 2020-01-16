package TopDown;

import org.junit.Test;

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

    @Test(expected = NullPointerException.class)
    public void isSortedAllStubNull() {
        assertTrue(isSortedAllStub(null));
    }

    @Test
    public void isSortedEqualsStubFalse() {
        int [] arr = {1,3,2};
        int[] sorted = Program.sortArray(arr);
        assertFalse(EqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test
    public void isSortedEqualsStubTrue() {
        int [] arr = {1,2,3};
        int[] sorted = Program.sortArray(arr);
        assertTrue(EqualsArraysStub.equalsArraysStub(arr, sorted));
    }

    @Test(expected = NullPointerException.class)
    public void isSortedEqualsStubNull() {
        int [] arr = null;
        int[] sorted = Program.sortArray(arr);
        assertTrue(EqualsArraysStub.equalsArraysStub(arr, sorted));
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

    @Test(expected = NullPointerException.class)
    public void isSortedNull() {
        int [] arr = null;
        assertTrue(Program.isSorted(arr));
    }

    private boolean isSortedAllStub(int [] arr) {
        int [] sorted = SortArrayStub.sortArrayStub(arr);
        boolean isSorted = EqualsArraysStub.equalsArraysStub(arr,sorted);
        return isSorted;
    }

}
