package TopDown;

import java.util.Arrays;
import java.util.Collections;

public class MaxValueStub {
    public static int maxValueStub(int [] arr){
        Integer [] arrInteger = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInteger[i] = arr[i];
        }
        return Collections.max(Arrays.asList(arrInteger));
    }
}
