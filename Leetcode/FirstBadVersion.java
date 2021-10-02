/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
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

//Time Limit exceeds for this code

*/

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
            //(low+high)/2; 
        if(isBadVersion(low))
            return low;
        low=2;
        while(isBadVersion(mid)!=true ||  isBadVersion(mid-1)!=false)
        {
            //mid=(high+low)/2;
            // Time Limit Exceeded error is due to this line as int limit may overflow
        //if we have large value of low and high then their added value can be greater than integer size(max. limit) thus even that it is sure that the value after division will be in range but still value   can overflow
        //Refer to link: https://ai.googleblog.com/2006/06/extra-extra-read-all-about-it-nearly.html
            
            //mid=lower point+ (difference of higher point + lower point)/2
            
            mid=low+(high-low)/2;
            
            if(isBadVersion(mid)==false)
            {
                low=mid+1;
            }
             if(isBadVersion(mid)==true)
             {
                high=mid;
             }
        }
         //System.out.println("hello"+isBadVersion(mid)+","+isBadVersion(mid-1));
        return mid;
        
    }
}
