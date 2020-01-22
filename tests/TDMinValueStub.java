import java.util.Arrays;
import java.util.Collections;

public class TDMinValueStub {


    public static int minValueStub(int [] arr){
        Integer [] arrInteger = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInteger[i] = arr[i];
        }
        return Collections.min(Arrays.asList(arrInteger));
    }

    public static int minValueMinIndexStub(int [] arr){
        int ind = TDMinValueIndexStub.minValueIndexStub(arr);
        return arr[ind];
    }

}
