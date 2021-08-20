//Dynamic Approach
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#
//Time Complexity: O(n)
//Space Complecity: O(1)
class KadaneAlgoDynamic{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int localMax=0;
        int MaxTillNow=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            localMax=Math.max(localMax,localMax+arr[i]);
            MaxTillNow=Math.max(MaxTillNow,localMax);
        }
        return MaxTillNow;
    }
    
}
