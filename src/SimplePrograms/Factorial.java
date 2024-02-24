package SimplePrograms;

public class Factorial {
   public static void main(String[]  args){
       int x = 4;
       recursion(4);
   }
   static int recursion(int x){
       return (x*(x-1));
   }
}
