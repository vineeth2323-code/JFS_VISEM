import java.util.*;
public class Main_arr {
    public static void main(String[] args){
    int[] arr={12,27,7,4,6,2,3,5,1,16};
        System.out.print(fun(arr));
    }
    public static List<Integer> fun(int[] arr){
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) odd.add(arr[i]);
            if(arr[i]%2==0) even.add(arr[i]);
        }
        odd.addAll(even);
        return odd;
    }
}
