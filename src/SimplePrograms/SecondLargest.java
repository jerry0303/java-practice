package SimplePrograms;

public class SecondLargest {

    public static void main(String[] args) {
        int a[] =  {4, 33,10,55,532, 3, 9};

        int largest = a[0];
        int secondLargest = a[0];
        for(int i=0;  i<a.length; i++){
            if(a[i]  > largest){
                secondLargest = largest;
                largest = a[i];
            }

            if(a[i] < largest && a[i] > secondLargest){
                secondLargest = a[i];
            }
        }
        System.out.println("Second largest is "+secondLargest);
    }
}
