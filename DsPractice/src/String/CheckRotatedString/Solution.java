package String.CheckRotatedString;

class Solution {
    public static boolean rotateString(String s, String goal) {

        if(s.length()!= goal.length())
            return false;

        String txt = s.concat(s);
        if(txt.indexOf(goal)!=-1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcd", "cdab"));
    }
}

