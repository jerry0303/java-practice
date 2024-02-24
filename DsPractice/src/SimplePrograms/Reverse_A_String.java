package SimplePrograms;

public class Reverse_A_String{

    static char[] logicFunction(char[] charArray, int start, int end){

        while(start<end){
            char temp = charArray[start];
            charArray[start]  = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return charArray;
    }

    static String reverseSentence(char[] charArray){
        int start=0;

        for(int end=0; end<charArray.length; end++){
            if(charArray[end]==' '){
                logicFunction(charArray, start, end);
                start = end+1;
            }
        }

        logicFunction(charArray, 0, charArray.length-1);

        String Rs = new String(charArray);
        return  Rs;

    }




    public static void main(String args[]){

        String OriginalString =  "Indore is heaven ";
        String Rs1  = reverseSentence(OriginalString.toCharArray());
        System.out.print(Rs1+"\n");
    }
}