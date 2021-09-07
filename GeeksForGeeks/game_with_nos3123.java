//https://practice.geeksforgeeks.org/problems/game-with-nos3123/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
//User function Template for Java
//Time complexity: O(n)
//Space Complexity: O(1)
//XOR: odd number of 1's give 1

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0; i<n-1; i++)
        {
            arr[i]=arr[i]^arr[i+1];
        }
        return arr;
    }
    
    
}

