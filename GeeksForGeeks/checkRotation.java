//Time complexity: O(n^2)
//Space Complexity: O(1)
//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
//https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1#

class checkRotation
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        boolean resFlag=false;
        for(int i=0; i<s1.length();i++)
        {
            if(s2.charAt(0)==s1.charAt(i))
            {
                resFlag=s2.equals(s1.substring(i)+s1.substring(0,i));
            }
            if(resFlag)
                break;
        }
        return resFlag;
    }
    
}
