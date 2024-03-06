package DataStructure.Array.Medium.SortArraysOf_0s1s2s;


/*Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.


[1,3,2,7,11,15], target = 9
*/
public class TwoSumSol1{

    static int[] twoSum(int[] a, int target){
       int sum = 0;
        for(int i=0; i<a.length; i++) {
            int j = i + 1;

            sum = a[i] + a[j];
            if (sum == target) {
                return new int[]{i, j};
            }
        }
        return null;
    }
    public static void main(String args[]){
        int arr[] = {3,4,2,6,8,11};
        int target =8;
        int x [] = twoSum(arr, target);
        for(int a:  x){
            System.out.print(a+"  ");
        }

    }
}
