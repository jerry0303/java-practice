import java.io.*;
import java.util.*;

public class SolutionArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        Scanner sc  = new Scanner(System.in);
        int total_lines = sc.nextInt();

        List<List<Integer>> listOfList = new ArrayList<>();
        for(int i =  0;  i< total_lines; i++){
            int d =   sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j  < d;  j++){
                list.add(sc.nextInt());
            }
           listOfList.add(list);
        }

        int noOfInputs = sc.nextInt();
        for(int i=0; i<noOfInputs; i++){
            int arraySq = sc.nextInt();
            int findX  = sc.nextInt();
            try{
                 System.out.println(listOfList.get(arraySq-1).get(findX-1));
            }
          catch(IndexOutOfBoundsException  e){
              System.out.println("ERROR!");
          }
        }
    }
}
