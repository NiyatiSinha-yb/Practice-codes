//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
//TimeComplexity: O(n)
//Space Complexity: O(1)
class KadaneAlgo{

    // a: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int a[], int n){
        int maxSum=Integer.MIN_VALUE;
        int maxSumLocal=0;
        for(int i=0; i<n; i++)
        {
            maxSumLocal+=a[i];
            if(maxSum<maxSumLocal)
            {
                maxSum=maxSumLocal;
            }
            if(maxSumLocal<0)
            {
                maxSumLocal=0;
            }
            
        }
        return maxSum;
    }
}
