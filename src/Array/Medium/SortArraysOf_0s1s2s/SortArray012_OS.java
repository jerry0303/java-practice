package Array.Medium.SortArraysOf_0s1s2s;

public class SortArray012_OS {

    static void colorSort(int[] a){


        int low = 0;
        int mid = 0;
        int high = a.length-1;

        while(mid<=high){

            if(a[mid] == 0){
                int  temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                low++;
                high--;
            }

            else if(a[mid]==1){
                mid++;
            }
            else{

            }
        }

    }

    public static void main(String args[]) {
        int arr[] = {0,2,0,1,1,2,0,1,1,0,1,2,0,1,2,1,2,2,1};

        colorSort(arr);
    }
}
