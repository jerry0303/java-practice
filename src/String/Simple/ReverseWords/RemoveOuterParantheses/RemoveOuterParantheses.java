package String.Simple.ReverseWords.RemoveOuterParantheses;

class RemoveOuterParantheses{

    static String removeOuterParentheses(String S)
    {
        String res = "";
        int count = 0;
        for (int c = 0; c < S.length(); c++)
        {
            if (S.charAt(c) == '(' && count++ > 0)
                // Include the character
                res += S.charAt(c);
            if (S.charAt(c) == ')' && count-- > 1)
                // Include the character
                res += S.charAt(c);
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "(()())(())()";
        System.out.print(removeOuterParentheses(S));
    }
}