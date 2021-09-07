
//User function Template for Java
//https://practice.geeksforgeeks.org/problems/play-with-or5515/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
//Time Complexity: O(N)
//Auxiliary Space: O(1)
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1; i++)
        {
            arr[i]|=arr[i+1];
        }
        return arr;
    }
    
    
}
