package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//WAYS TO CEREATE & INITIALIZE A LIST
public class BasicOperations {

    public static void main(String args[]){
        //1. Using add method
        /*List<Integer>  listUsingAddMethod  = new ArrayList<>();
        listUsingAddMethod.add(1001);
        listUsingAddMethod.add(2002);
        System.out.println("Using add method : " + listUsingAddMethod.toString());
         */




        //2. DOUBLE BRACES INITIALIZATION
        /*List<Integer>  list2 = new ArrayList<Integer>(){{
            add(909);
            add(808);
        }};
        System.out.println("DOUBLE BRACES INITIALIZATION : " + list2.toString());*/







        //3. Creating Immutable List Creating Immutable List
        // Arrays.asList() creates an immutable list from an array.
        // Hence it can be used to instantiate a list with an array
        // It can be modified once created
        /*List<Integer>  immutableList = Arrays.asList(1,2,3);
        immutableList.add(4);
        System.out.println("Arrays.asList() : " + immutableList);*/


        //4. Creating Mutable List
        /*List<Integer>  mutableList = new ArrayList<>(Arrays.asList(1,2,3));
        mutableList.add(99);
        System.out.println("Arrays.asList() : " + mutableList);*/






        //5. Using Collections.unmodifiableList()
        //Collections.unmodifiableList() returns a list
        // which can’t be altered i.e.it can neither add or delete an element.
        // Any attempt to modify the list will result in an UnsupportedOperationExample

        /*List<Integer> unmodifiableList = Collections.unmodifiableList(
                Arrays.asList(1,2,3));

        //unmodifiableList.add(11);
        System.out.println("unmodifiableList : " + unmodifiableList);*/

        //----------------




        //6. Using Collections.singletonList()
        //Collections.singletonList() returns an immutable list consisting of one element only.
        /*List<Integer> singletonList = Collections.singletonList(2);
        System.out.println("List : " + singletonList.toString());*/





        //7. Using java 8  stream
        //Collections.singletonList() returns an
        // immutable list consisting of one element only.
        List<Integer> streamList
                = Stream.of(90,23)
                    .collect(Collectors.toList());
        System.out.println("streamList : " + streamList.toString());

        List<Integer> streamArrayList
                = Stream
                .of(89, 13)
                .collect(
                        Collectors
                                .toCollection(ArrayList::new));
        System.out.println("streamArrayList : " + streamArrayList.toString());

        List<Integer> unmodifiableList
                = Stream
                .of(1, 43)
                .collect(
                        Collectors
                                .collectingAndThen(
                                Collectors.toList(),
                                Collections::unmodifiableList));
        System.out.println("unmodifiableList : " + unmodifiableList.toString());




        //----------
        //  Using Java 9 List.of()
        // Creating a list using List.of()
       /* List<Integer> unmodifiableList9 = List.of(1, 2, 3);

        // Printing the List
        System.out.println("unmodifiableList9 : "
                + unmodifiableList9.toString());*/

    }
}
