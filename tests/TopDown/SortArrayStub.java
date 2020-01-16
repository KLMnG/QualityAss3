package TopDown;

import java.util.Arrays;

public class SortArrayStub {


    public static int [] sortArrayStub(int [] arr){
        int [] sorted = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
    public static int [] sortArrayAllStub(int [] arr){
        if (arr == null) return null;
        int[] res = Arrays.copyOf(arr,arr.length);
        for(int i=0; i<arr.length; i++)
            for (int j=0; j<arr.length-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int [] sortArraySizeStub(int [] arr){
        if (arr == null) return null;
        int[] res = Program.copyArr(arr);
        for(int i=0; i<arr.length; i++)
            for (int j=0; j<arr.length-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int [] sortArrayCopyArrStub(int [] arr){
        if (arr == null) return null;
        int[] res = Arrays.copyOf(arr,arr.length);
        for(int i=0; i<Program.size(arr); i++)
            for (int j=0; j<Program.size(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }
    public static int [] sortArray(int [] arr){
        return Program.sortArray(arr);
    }
}
