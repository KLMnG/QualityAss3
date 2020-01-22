import java.util.Arrays;

public class TDEqualsArraysStub {

    public static boolean equalsArraysStub(int [] arr1, int [] arr2){
        return Arrays.equals(arr1,arr2);
    }

    public static boolean equalsArraysSizeStub(int [] arr1, int [] arr2){
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (TDSizeStub.sizeStub(arr1)!= TDSizeStub.sizeStub(arr2)) return false;
        for (int i = 0; i< TDSizeStub.sizeStub(arr1); i++)
            if (arr1[i]==arr2[i]) return true;
        return false;
    }
}
