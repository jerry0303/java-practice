package Array.Medium.SortArraysOf_0s1s2s;

public class SortArray012 {

    static int[] placeElements(int[]  a, int start, int end, int color){


        for(int i=start; i<end; i++){
            a[i]= color;
        }
        return a;
    }

    static void sortColors(int[] nums){
        int count0 = 0;
        int count1= 0;
        int count2= 0;

        for(int i=0;  i<nums.length; i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else if(nums[i]==2){
                count2++;
            }
        }
        placeElements(nums, 0, count0, 0);
        placeElements(nums, count0, count0+count1, 1);
        placeElements(nums, count0+count1, nums.length, 2);

        for(int x:  nums){
            System.out.print(x+" ");
        }

    }
    public static void main(String args[]) {
        int arr[] = {0,2,0,1,1,2,0,1,1,0,1,2,0,1,2,1,2,2,1};
        sortColors(arr);
    }
}
