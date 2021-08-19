//Time Complexity: O(sqrt(N))
//Auxiliary Space: O(1)
//User function Template for Java
//https://practice.geeksforgeeks.org/problems/count-squares3649/1#

class CountSquares {
    static int countSquares(int N) {
        
        return (int)(Math.ceil(Math.sqrt(N)-1));
    }
}
