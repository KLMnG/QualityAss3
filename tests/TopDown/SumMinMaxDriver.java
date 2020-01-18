package TopDown;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class SumMinMaxDriver {


    @Test
    public void sumMinMaxAllStub(){
        int [] testArray = new int [] {1,2,3,4,10};
        assertEquals(11, sumMinMaxAllStub(testArray));
    }

    @Test(expected = NoSuchElementException.class)
    public void sumMinMaxEmptyAllStub() {
        int [] testArray = new int[]{};
        sumMinMaxAllStub(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNullAllStub() {
        int [] testArray = null;
        sumMinMaxAllStub(testArray);
    }

    @Test
    public void sumMinMaxMinStub(){
        int [] testArray = new int [] {1,2,3,4,10};
        assertEquals(11, sumMinMaxMinStub(testArray));
    }

    @Test(expected = NoSuchElementException.class)
    public void sumMinMaxEmptyMinStub() {
        int [] testArray = new int[]{};
        sumMinMaxMinStub(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNullMinStub() {
        int [] testArray = null;
        sumMinMaxMinStub(testArray);
    }

    @Test
    public void sumMinMaxStub(){
        int [] testArray = new int [] {1,2,3,4,10};
        assertEquals(11, sumMinMaxStub(testArray));
    }

    @Test(expected = NoSuchElementException.class)
    public void sumMinMaxEmptyStub() {
        int [] testArray = new int[]{};
        sumMinMaxStub(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNullStub() {
        int [] testArray = null;
        sumMinMaxStub(testArray);
    }

    @Test
    public void sumMinMaxMinRealStub(){
        int [] testArray = new int [] {1,2,3,4,10};
        assertEquals(11, sumMinMaxMinRealStub(testArray));
    }

    @Test(expected = NoSuchElementException.class)
    public void sumMinMaxMinRealEmptyStub() {
        int [] testArray = new int[]{};
        sumMinMaxMinRealStub(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxMinRealNullStub() {
        int [] testArray = null;
        sumMinMaxMinRealStub(testArray);
    }

    @Test
    public void sumMinMax(){
        int [] testArray = new int [] {1,2,3,4,10};
        assertEquals(11, Program.sumMinMax(testArray));
    }

    @Test(expected = NoSuchElementException.class)
    public void sumMinMaxEmpty() {
        int [] testArray = new int[]{};
        Program.sumMinMax(testArray);
    }

    @Test(expected = NullPointerException.class)
    public void sumMinMaxNull() {
        int [] testArray = null;
        Program.sumMinMax(testArray);
    }

    private int sumMinMaxAllStub(int [] arr){
        return MinValueStub.minValueStub(arr) + MaxValueStub.maxValueStub(arr);
    }

    private int sumMinMaxMinStub(int[] arr) {
        return MinValueStub.minValueStub(arr) + MaxValueStub.maxValueMinIndexStub(arr);
    }
    private int sumMinMaxStub(int[] arr) {
        return MinValueStub.minValueMinIndexStub(arr) + MaxValueStub.maxValueMinIndexStub(arr);
    }
    private int sumMinMaxMinRealStub(int[] arr) {
        return Program.minValue(arr) + MaxValueStub.maxValueMinIndexStub(arr);
    }

}
