package String.Simple.isAnagram;
import java.util.Arrays;

class sol1{
    static boolean isAnagram(String s, String t)
    {

        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        char[]  s1 = s.toCharArray();
        char[]  t1= t.toCharArray();


        Arrays.sort(s1);
        Arrays.sort(t1);
        if(Arrays.equals(s1,t1)==true)
        return true;
        else
        return  false;

    }

    // Driver Code
    public static void main(String[] args)
    {
        String s = "tar";
        String t = "rat";
        System.out.print(isAnagram(s, t));
    }
}