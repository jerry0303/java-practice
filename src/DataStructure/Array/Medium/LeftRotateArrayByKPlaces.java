package DataStructure.Array.Medium;
public class LeftRotateArrayByKPlaces {
    static int[] rotate(int []arr, int k){
        k  = k % arr.length;
        for(int  i=0; i<k; i++){
            rotateByOne(arr);
        }
        return arr;
    }

    static int[] rotateByOne(int []arr){
        int temp =  arr[0];
        for(int  i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
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
