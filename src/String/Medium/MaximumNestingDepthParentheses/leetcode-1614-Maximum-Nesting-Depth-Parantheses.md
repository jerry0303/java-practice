### Sort Characters By Frequency

https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

```
Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.
```

```
Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3
```

#### Solution 1
Count the frequency of each character, and then sort the characters by frequency and out put the characters. We can use a two dimension array for the easy counting and sorting.
```java
ll
```

```java
class Solution {
    public int maxDepth(String s) {
        int count =0;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                if(count < st.size())
                    count = st.size();
                st.pop();
            }
        }
        return count;
    }
}
```