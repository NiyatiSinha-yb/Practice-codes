//User function Template for Java

//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
//https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int sumStart=0;
        int sumEnd=0;
        for(int i=0; i<n/2;i++)
        {
            sumStart+=arr[i];
        }
         for(int i=n/2; i<n;i++)
        {
            sumEnd+=arr[i];
        }
        return sumStart*sumEnd;
    }
    
    
}
