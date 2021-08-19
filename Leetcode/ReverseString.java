//https://leetcode.com/problems/reverse-string/submissions/
//Space Complexity: O(1)
//Time Complexity: O(n)

class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int i=0, j=s.length-1;
        for(i=0,j=s.length-1; i!=j && i!=j+1;i++,j--)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
