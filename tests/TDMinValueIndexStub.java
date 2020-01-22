import java.util.NoSuchElementException;

public class TDMinValueIndexStub {

    public static int minValueIndexStub(int [] arr){
        if (arr.length == 0)
            return -1;
        int min = arr[0];
        int minIdx = 0;
        int index = 0;
        for (int val :arr) {
            if (val < min) {
                min = val;
                minIdx = index;
            }
            index++;
        }
        return minIdx;
    }
}
