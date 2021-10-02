//278. First Bad Version
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//Time Complexity: O(log n)
//Space complexity: O(1)
//https://leetcode.com/problems/first-bad-version/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low=1;
        int high=n;
        int mid=1;
        while(low<high)
        {
            mid=low+(high-low)/2;
            if(!isBadVersion(mid))
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }//first true is found when low==high
        return low;
    }
}
