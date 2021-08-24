//Time Complexity: O(n)
//Space Complexity: O(n)
//https://leetcode.com/problems/shuffle-string/submissions/
class ShuffleString2 {
    public String restoreString(String s, int[] indices) {
        String result="";
        char arr[]=new char[s.length()];
        for(int i=0; i<s.length();i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        for(int i=0; i<s.length();i++)
        {
            result+=arr[i];
        }
        return result;
    }
}
