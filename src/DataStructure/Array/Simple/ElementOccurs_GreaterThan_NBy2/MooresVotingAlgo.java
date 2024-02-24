package DataStructure.Array.Simple.ElementOccurs_GreaterThan_NBy2;
import java.util.HashMap;
import java.util.Map;
public class MooresVotingAlgo {
    static int sol1(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > n / 2)
                return a[i];
        }
        return -1;
    }
    static int sol2(int a[]){
        int n =  a.length;
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            int value = m1.getOrDefault(a[i],0);
            m1.put(a[i], value+1);
        }
        for(Map.Entry<Integer, Integer> it: m1.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
    static int mooresVotingAlgo(int a[]){
        int n  = a.length;
        int el=0;
        int count=0;
        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                el = a[i];
            }
            else  if(el == a[i])  count++;
            else count --;
        }
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(a[i]==el)
                count1++;
        }
        if(count1 >(n/2)) return el;
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {0,2,0,3,3,3,3,3,4};
        //System.out.println(mooresVotingAlgo(arr));
        //System.out.println(sol1(arr));
        System.out.println(sol2(arr));
    }
}
