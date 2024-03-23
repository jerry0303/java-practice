package Arrays.MissingNumberInArray;

public class Solution {
    static void Solution1(int arr[]){
        int N  =  arr.length;
        int hash[] = new int[N+1];
        for(int i=0; i<N-1; i++){
            //hash[arr[i]] = 1;
            hash[arr[i]]++;
        }
        for(int i=1; i<=N; i++){
            if(hash[i]==0){
                System.out.print(i + " ");
            }
        }
    }
    static void Solution2(int arr[]){
        //sum of series n  = (n*(n=1))/2
        int N  =  arr.length;
        int sumOfSeries  = (N*(N+1))/2;
        int sumOfArray=0;
        for(int i=0; i<N; i++){
            sumOfArray  = sumOfArray + arr[i];
        }
        int missingNum = sumOfSeries - sumOfArray;
        System.out.println(missingNum);
    }

    static void Solution3(int arr[]){
        //x1 XOR  of N Numbers
        //x2 XOR of Arrays  elements
        //x3
        //(1^2^3^4^5)  ^ (1^2^4^5)
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,5};
        Solution1(arr);
        //Solution2(arr);
        //Solution3(arr);
    }
}
