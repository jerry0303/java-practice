package DataStructure.HashMap;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class LearnHashMap {


    public  static void main(String  args[]){
        Map<Integer, Integer> h1 = new HashMap<Integer,  Integer>();

        h1.put(1,100);
        h1.put(2,200);
        h1.put(3,300);
        h1.put(4,400);
        h1.put(5,500);

        //h1.compute();
        System.out.println(h1);
        h1.merge(1,900, (val1, val2) -> val2);
        h1.merge(6,1100, (val1, val2) -> val1+val2);
        System.out.println(h1);

        System.out.println("Get");
        System.out.println(h1.get(2));
        h1.clear();

        System.out.println("\nClear");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
            System.out.println(e.hashCode());
        }

        System.out.println("\nHashCode");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
            System.out.println(e.hashCode());
        }
        System.out.println("\n");

        System.out.println("Keys");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
            System.out.println(e.getKey());
        }

        System.out.println("\nValues");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
            System.out.println(e.getValue());
        }

        System.out.println("\nSet Values - 1");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
            e.setValue(1);
        }

        System.out.println("\nGet Values");
        for(Map.Entry<Integer, Integer> e: h1.entrySet()){
        System.out.println(e.getValue());
        }

    }
}
