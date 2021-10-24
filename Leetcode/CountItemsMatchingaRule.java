//https://leetcode.com/problems/count-items-matching-a-rule/
//1773. Count Items Matching a Rule
//Time Complexity: O(n log n)
//Space Complexity: O(1)


class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minMoves=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0; i<seats.length; i++)
            minMoves+=Math.abs(seats[i]-students[i]);
        return minMoves;
    }
}
