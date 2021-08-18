
//User function Template for Java
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
//Considering to rotate by k elements
//Time Complexity: O(n)
//Space Complexity: O(n) 

class RotateByN {
    
    public void rotate(int arr[], int n)
    {
        int k=1; // Enter Value of k to rotate by k elements
        int index=-1;
        int toRotate[]= new int[k];
        
        for(int i=n-k; i<n; i++)
        {
            toRotate[++index]=arr[i];
        }
        for(int i=n-k-1; i>=0; i--)
        {
            arr[i+k]=arr[i];
        }
        index=-1;
        for(int i=0; i<k; i++)
        {
            arr[i]=toRotate[i];
        }
       
       
    }
}
