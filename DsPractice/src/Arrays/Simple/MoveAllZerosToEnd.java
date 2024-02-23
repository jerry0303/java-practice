package Arrays.Simple;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerosToEnd {
    static int[] moveZeros(int[] a,  int n){

        List<Integer> zerosList  = new ArrayList<>();
        for(int i= 0; i<n; i++){
            if(a[i]!=0){
                zerosList.add(a[i]);
            }
        }
        int nz = zerosList.size();

        for(int i=0; i<nz; i++){
            a[i] = zerosList.get(i);
        }

        for(int i=nz; i<n; i++){
            a[i] = 0;
        }

        return a;
    }
    public static void main(String[] args){
        int arr[] = {11,12,0,0,0,13,18};
        int n = arr.length;
        moveZeros(arr, n);
        for(int x:  arr){
            System.out.print(x+" ");
        }
    }
}
