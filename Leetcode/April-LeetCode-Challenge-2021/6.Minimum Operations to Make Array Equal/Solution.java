class Solution {
    public int minOperations(int n) {
        int count=0;
        for(int i=0; i<n/2; i++){
            count=count+((n-1)-i-i);
        }
        return count;
    }
}
//your memory usage beats 49.85 % of java submissions.
//Your runtime beats 39.58 % of java submissions.
