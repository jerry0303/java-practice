package String.DecreasingOrderFrequency;

import java.util.HashMap;
import java.util.Map;

class  DecreasingOrderFrequency{
    public static String frequencySort(String s) {
        //tatt

        Map<String, Integer> m1 = new HashMap<>();

        for(int i=0;  i<s.length(); i++){

            if(m1.containsKey(String.valueOf(s.charAt(i)))){
                m1.put(String.valueOf(s.charAt(i)), m1.get(String.valueOf(s.charAt(i)))+1);
            }
            else{
                m1.put(String.valueOf(s.charAt(i)),1);
            }
        }
        return s;
    }

    public static void main(String args[]){
        String s = "tattt";


        System.out.println(frequencySort(s));
    }
}