package Arrays;
public class LeftRotateArrayByKPlacesOS {
    static int[] rotate(int []arr, int k){
        k  = k % arr.length;
        for(int  i=0; i<k; i++){
            reverse(arr, 0, k-1);
            reverse(arr, k, arr.length-1);
        }
        return arr;
    }

    static int[] reverse(int []arr, int start, int end){
        while(start<end) {
            int temp = arr[0];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5,6};

        rotate(arr, 4);
        for(int x:  arr){
            System.out.print(x+" ");
        }
    }
}
