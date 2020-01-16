package TopDown;

import java.util.Arrays;
import java.util.Collections;

public class MinValueStub {


    public static int minValueStub(int [] arr){
        Integer [] arrInteger = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInteger[i] = arr[i];
        }
        return Collections.min(Arrays.asList(arrInteger));
    }

}
