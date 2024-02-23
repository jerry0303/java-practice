package Arrays.Simple;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerosToEndOs {
    static int[] moveZeros(int[] a,  int n){

        int j = -1;
        for(int i= 0; i<n; i++){
            if(a[i]==0){
                j = i;
                break;
            }
        }
        if (j == -1) return a;
        for(int i=j+1; i<n; i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
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
