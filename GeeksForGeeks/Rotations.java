
//Time complexity: O(n)
//Space Complexity: O(1)
//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
//https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1#

class Rotations
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length())
            return false;
        else
            return((s1+s1).contains(s2) ? true: false);
            //OR replace line 16 with block below
            /*
             {
                if((s1+s1).indexOf(s2)>=0)
                    return true;
                return false;
            }
            */
    }
    
}
