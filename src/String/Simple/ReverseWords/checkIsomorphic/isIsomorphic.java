package String.Simple.ReverseWords.checkIsomorphic;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        if(s == null || t == null && s.length() != t.length())
            return false;

        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++){
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            if(map.containsKey(char1)){
                if(map.get(char1) != char2){
                    return false;
                }
            }
            else{
                if(map.containsValue(char2))
                    return false;

                map.put(char1, char2);
            }

        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("xxzz", "aacc"));
    }
}