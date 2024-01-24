package Arrays;

public class LeftRotateArrayBy1Place {

    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,16,19};
        int temp =  arr[0];
        for(int  i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        for(int x:  arr){
            System.out.print(x+" ");
        }
    }
}
