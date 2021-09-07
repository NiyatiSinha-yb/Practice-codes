//Time Complexity: O(N)
//Auxiliary Space: O(1)

//https://practice.geeksforgeeks.org/problems/c-arrays-sum-of-array-set-14805/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays
//User function Template for Java

class Solution {
    
    public long getSum(long a[], long n)
    {
        // Your code goes here
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
        }
        return sum;
    }
}Arrays
