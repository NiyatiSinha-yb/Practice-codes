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
        int localMax=arr[0];
        int MaxTillNow=arr[0];
        for(int i=1; i<n; i++)
        {
            localMax=Math.max(arr[i],localMax+arr[i]);
            MaxTillNow=Math.max(MaxTillNow,localMax);
        }
        return MaxTillNow;
    }
    
}
