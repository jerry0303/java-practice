package Arrays.Simple;
public class LeftRotateArrayByKPlacesOS {
    static int[] rotate(int []arr, int k){
        k  = k % arr.length;
        if(k<0){
            k= k+arr.length;
        }
            reverse(arr, 0, k-1);
            reverse(arr, k, arr.length-1);
            reverse(arr, 0, arr.length-1);

        return arr;
    }

    static int[] reverse(int []arr, int start, int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {11,12,13,14,15};

        System.out.print("Before Rotated Array is \n ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.print("\n \n ");
        rotate(arr, 1);
        System.out.print("After Rotated Array is \n ");
        for(int x:  arr){
            System.out.print(x+" ");
        }
    }
}
