//1688. Count of Matches in Tournament
//https://leetcode.com/problems/count-of-matches-in-tournament/submissions/
//time complexity: O(log n)
//Space complexity: O(1)


class Solution {
    public int numberOfMatches(int n) {
        int teams=n;
        int numOfMatches=0;
        while(teams!=0)
        {
            if(teams==1)
                return numOfMatches+0;
            int remaining=teams%2;
            teams=teams/2;
            numOfMatches+=teams;
            teams+=remaining;
        }
        return numOfMatches;
    }
}
