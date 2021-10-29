//https://leetcode.com/problems/excel-sheet-column-title/submissions/
//168. Excel Sheet Column Title

class Solution {
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
}
