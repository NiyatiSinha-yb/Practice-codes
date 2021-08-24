//Time Complexity: O(n)
//Space Complexity: O(n)
//https://leetcode.com/problems/shuffle-string/submissions/

class ShuffleString3 {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        for(int i=0; i<s.length();i++)
        {
            arr[indices[i]]=s.charAt(i);
        }
        return new String(arr);
    }
}
