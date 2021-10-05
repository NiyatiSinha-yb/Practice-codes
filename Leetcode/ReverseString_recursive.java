//https://leetcode.com/problems/reverse-string/submissions/
//Space Complexity: O(n)
//Time Complexity : O(n/2)
class Solution {
    static char[] globalArray;
    public void reverseString(char[] s) {
        globalArray=s;
        reverse(0, s.length-1);
    }
    public static void reverse(int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        else
        {
            char temp=globalArray[start];
            globalArray[start]=globalArray[end];
            globalArray[end]=temp;
            //System.out.println(start+", "+end);
            reverse(++start, --end);
        }
    }
}
