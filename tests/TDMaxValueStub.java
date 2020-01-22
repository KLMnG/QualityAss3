import java.util.Arrays;
import java.util.Collections;

public class TDMaxValueStub {
    public static int maxValueStub(int [] arr){
        Integer [] arrInteger = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInteger[i] = arr[i];
        }
        return Collections.max(Arrays.asList(arrInteger));
    }

    public static int maxValueMinIndexStub(int [] arr){
        int ind = TDMaxValueIndexStub.maxValueIndexStub(arr);
        return arr[ind];
    }
}
