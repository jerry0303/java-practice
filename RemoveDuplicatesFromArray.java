package Arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String args[]){
        int arr[] = {2,2,3,4,5,5,6,16,16,19};
        int k  = removeDuplicates(arr);
        for(int i=0; i<k; i++){
        System.out.print(arr[i]+"   ");
        }

    }
    static int removeDuplicates(int[] arr){
        HashSet<Integer> set  = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k =  set.size();
        int j=0;
        for(int x: set){
            arr[j++] = x;
        }
        return k;
    }
}
