//Time Complexity: O(length of String)
//Space Complexity: O(1)
//https://leetcode.com/problems/excel-sheet-column-number/
//171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int val=0;
        int len=columnTitle.length();
        int placeValue=len-1;
        //
        if(len>0)
        {
            for(int i=0; i<len-1; i++)
            {
                val=val*26+alphaMapping(columnTitle.charAt(i))*26;
                placeValue--;
            }
        }
        val+=alphaMapping(columnTitle.charAt(len-1));
        return val;
    }
    public int alphaMapping(char column) {
        switch(column)
        {
                case 'A': return 1;
                case 'B': return 2;
                case 'C': return 3;
                case 'D': return 4;
                case 'E': return 5;
                case 'F': return 6;
                case 'G': return 7;
                case 'H': return 8;
                case 'I': return 9;
                case 'J': return 10;
                case 'K': return 11;
                case 'L': return 12;
                case 'M': return 13;
                case 'N': return 14;
                case 'O': return 15;
                case 'P': return 16;
                case 'Q': return 17;
                case 'R': return 18;
                case 'S': return 19;
                case 'T': return 20;
                case 'U': return 21;
                case 'V': return 22;
                case 'W': return 23;
                case 'X': return 24;
                case 'Y': return 25;
                case 'Z': return 26;
        }
        return 0;
    }
}
