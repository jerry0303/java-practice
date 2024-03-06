package SimplePrograms;

import  java.util.HashMap;

import java.util.Map;

public class HashMapSample{

    public static void main(String args[]){
        HashMap<Integer, String> h1 = new HashMap<>();

        h1.put(1,"Harshal");
        h1.put(2,"Verma");

        for(Map.Entry<Integer, String> entry: h1.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
