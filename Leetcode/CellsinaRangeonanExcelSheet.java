//Time Complexity:O(n^2)
//Space Complexity: O(n)
//6016. Cells in a Range on an Excel Sheet
//https://leetcode.com/contest/weekly-contest-283/problems/cells-in-a-range-on-an-excel-sheet/

class Solution {
    public List<String> cellsInRange(String s) {
        
     List <String> res =new ArrayList<String>();
     char startAlphabet=s.charAt(0);
     char endAlphabet=s.charAt(3);
     int startIndex=Integer.parseInt(s.charAt(1)+"");
     int endIndex=Integer.parseInt(s.charAt(4)+"");
        
        for(char start=startAlphabet; start<=endAlphabet; start++)
        {
            for(int i=startIndex; i<=endIndex; i++)
            {
                String ele=start+""+i;
                res.add(ele);
            }
        }
        return res;
    }
}
