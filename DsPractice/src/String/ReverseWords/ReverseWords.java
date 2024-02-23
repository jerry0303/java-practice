package String.ReverseWords;

import java.util.Stack;

public class ReverseWords {
    static String reverse(String s){
        //"Are you aware of time";
        s +=" ";
        String str = "";
        String ans= "";
        Stack<String> st  =  new Stack<String>();
        for(int i=0;  i<s.length(); i++){

            if(s.charAt(i)==' '){        //Space should be dennoted like this ' '
                st.push(str);
                str="";
            }
            else{
                str += s.charAt(i);
            }

        }
        while(st.size() != 1){
            ans += st.peek()+" ";
            st.pop();
        }
        ans += st.peek();
        System.out.println(ans);
        return s;
    }

    static String reverseOs(String s){
        //"Are you aware of time";
        //left             right
        String temp="";
        String str="";
        int left = 0;
        int right = s.length()-1;
        String ans = "";

        while(left <= right){
            char ch =  s.charAt(left);
            if(ch != ' '){
                temp +=  ch;
            }
            else if(ch ==' '){
                if(!ans.equals("")) {
                    ans  =  temp + " " + ans;
                }
                else{
                    ans  = temp;
                }
                temp ="";
            }
            left++;
        }
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }
        System.out.println(ans);
        return s;
    }
    public static void main(String[] args){
        String qs = "Are you aware of time";
        //reverse(s);
        reverseOs(qs);
    }
}
