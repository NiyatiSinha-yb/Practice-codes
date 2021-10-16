//1652. Defuse the Bomb
//https://leetcode.com/problems/defuse-the-bomb/
//Time Complexity: O(n*k)
//Space complexity:O(n)

class Solution {
    public int[] decrypt(int[] code, int k) {
        int count=0;
        int j;
        int res[]=new int[code.length];
        if(k>=0)
        {
            for(int i=0; i<code.length; i++)
            {
                count=0;
                j=i+1;
               // System.out.println("Working for "+code[i]+" : ");
                while(count<k)
                {
                    if(j>code.length-1)
                    {
                        j=0;
                    }
                  //  System.out.println(" ; "+code[j]+" ");
                    res[i]+=code[j++];
                    count++;

                }
               // System.out.println();
            }
        }
        else
        {
            for(int i=0; i<code.length; i++)
            {
                count=0;
                j=i-1;
              //  System.out.println("Working for "+code[i]+" : ");
                while(count>k)
                {
                    if(j<0)
                    {
                        j=code.length-1;
                    }
                    //System.out.println(" ; "+code[j]+" ");
                    res[i]+=code[j--];
                    count--;

                }
                //System.out.println();
            }
        }
        return res;
    }
}
