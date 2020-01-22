import java.util.Arrays;

public class TDSortArrayStub {


    public static int [] sortArrayStub(int [] arr){
        int [] sorted = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
    public static int [] sortArrayAllStub(int [] arr){
        if (arr == null) return null;
        int[] res = TDCopyArrStub.copyArrStub(arr);
        for(int i = 0; i< TDSizeStub.sizeStub(arr); i++)
            for (int j = 0; j< TDSizeStub.sizeStub(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int [] sortArraySizeStub(int [] arr){
        if (arr == null) return null;
        int[] res = TDCopyArrStub.copyArrAllStub(arr);
        for(int i = 0; i< TDSizeStub.sizeStub(arr); i++)
            for (int j = 0; j< TDSizeStub.sizeStub(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }
}
