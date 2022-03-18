//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/
//1309. Decrypt String from Alphabet to Integer Mapping
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public String freqAlphabets(String s) {
        String res="";
        String num="";
        int temp=0;
        //int numAscii=0;
        for(int i=0; i<s.length();)
        {
            if(i+2<s.length() && s.charAt(i+2)=='#')
            {
                num=""+s.charAt(i);
                temp=Integer.parseInt(num);
                
                num=""+s.charAt(i+1);
                temp=temp*10+Integer.parseInt(num);
                
                //System.out.println(temp);
                
                res+=""+(char)(temp+96);
                
                //res=""+(char)(temp+96);
                
                i+=3;
            }
            else
            {
                num=Integer.parseInt((s.charAt(i)+""))+96+"";
                //System.out.println(num);
                temp=Integer.parseInt(num);
                //System.out.println(temp);
                res+=""+(char)temp;
                i++;
            }
        }
        return res;
    }
}
