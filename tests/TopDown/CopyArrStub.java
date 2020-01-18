package TopDown;

public class CopyArrStub {


    public static int [] copyArrStub(int [] arr){
        return arr.clone();
    }

    public static int [] copyArrAllStub(int [] arr){
        if (arr == null) return null;
        int[] res = new int[SizeStub.sizeStub(arr)];
        for(int i=0; i<SizeStub.sizeStub(arr); i++)
            res[i] = arr[0];
        return res;

    }

}
