package Array.Medium.SortArraysOf_0s1s2s;
import java.util.HashMap;
import java.util.Map;

/*Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.


[1,3,2,7,11,15], target = 9
*/
public class TwoSum{

    static int[] twoSum(int[] a, int target){
        Map<Integer, Integer> m1  = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int diff = target - a[i];
            if(m1.containsKey(diff)){
                return new int[]{m1.get(diff), i};
            }
            m1.put(diff,i);
        }
        return null;
    }
    public static void main(String args[]){
        int arr[] = {2,6,8,11};
        int target = 14;
        int x [] = twoSum(arr, target);
        for(int a:  x){
            System.out.print(a);
        }

    }
}
