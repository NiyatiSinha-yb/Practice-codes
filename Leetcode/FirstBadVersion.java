/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//Time Complexity: O(n)
//Space complexity: O(1)
//https://leetcode.com/problems/first-bad-version/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for(int i=1; i<=n; i++)
        {
            if(isBadVersion(i))
            {
                return i;
            }
        }
        return -1;
        
    }
}

//Time Limit exceeds for this code so lets implement in time complexity O(log n) 
