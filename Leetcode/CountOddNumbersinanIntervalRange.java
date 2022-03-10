//1523. Count Odd Numbers in an Interval Range
//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
//Time Complexity: O(1)
//space Complexity: O(1)

class Solution {
    public int countOdds(int low, int high) {
        int diff=high-low; 
        //low=3, high=7 -> {3,4,5,6,7} -> odd={3,5,7} -> [(high-low)/2]+1 
        //low=3, high=6 -> {3,4,5,6} -> odd={3,5} -> [(high-low)/2]+1
        //low=4, high=7 -> {4,5,6,7} -> odd={5,7} -> [(high-low)/2]+1
        //low=4, high=8 -> {4,5,6,7,8} => odd={5,7} -> [(high-low)/2]
        
        if(high%2==0 && low%2==0)
            return diff/2;
        return (diff/2)+1;
    }
}
