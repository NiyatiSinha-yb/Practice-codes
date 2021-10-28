//https://leetcode.com/problems/get-maximum-in-generated-array/submissions/
//1646. Get Maximum in Generated Array
//Time Compplexity; O(n+1)
//SPcae complexirty : O(n+1)

class Solution {
    public int getMaximumGenerated(int n) {
        int arr[]= new int[n+1];
        if(n<=1)
            return n;
        arr[0]=0;
        arr[1]=1;
        int max=Integer.MIN_VALUE;
        
        for(int i=2; i<n+1; i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i/2];
                if(arr[i]>max)
                    max=arr[i];
            }
            else
            {
                 arr[i]=arr[i/2]+arr[i/2+1];
                if(arr[i]>max)
                    max=arr[i];
            }
        }
 
        return max;
        
        
    }
}
