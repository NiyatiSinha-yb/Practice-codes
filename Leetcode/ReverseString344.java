//Time complexity : O(n)
//Space Complexity: O(n) for recursive stack -> inplace
//https://leetcode.com/problems/reverse-string/
//344. Reverse String
class Solution {
    public void reverseString(char[] s) {
        reverse(0,s);
    }
    void reverse(int i,char[] s)
    {
        int len=  s.length;
        if(i >= len/2) //len/2=2
        {
            return;
        }
        char temp=s[i]; //h
        int replaceWithElementAtIndex=len-i-1;
        s[i] = s[replaceWithElementAtIndex]; //o
        s[replaceWithElementAtIndex] = temp; //h
        i++;
        reverse(i,s); // update i for next iteration
    }
}
