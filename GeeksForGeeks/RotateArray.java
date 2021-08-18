//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
//User function Template for Java
//Time Complexity: O(n)
//Space complexity: O(1)

class RotateArray {
    
    public void rotate(int arr[], int n)
    {
        int last=arr[n-1];
        for(int i=n-1; i>=1; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
}
