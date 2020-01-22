import java.util.NoSuchElementException;

public class TDMaxValueIndexStub {

    public static int maxValueIndexStub(int [] arr){
        if (arr.length == 0)
            return -1;
        int max = arr[0];
        int maxIdx = 0;
        int index = 0;
        for (int val :arr) {
            if (val > max) {
                max = val;
                maxIdx = index;
            }
            index++;
        }
        return maxIdx;
    }
}
