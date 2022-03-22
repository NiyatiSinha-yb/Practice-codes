//2103. Rings and Rods
//https://leetcode.com/problems/rings-and-rods/
//Time Complexity: O(rings.length)
//Space Complexity: O(3*numRings)
class Solution {
    public int countPoints(String rings) {
        int numRings=10;
        int R[]=new int[numRings];
        int G[]=new int[numRings];
        int B[]=new int[numRings];
        
        for(int i=0; i<rings.length(); i=i+2)
        {
            //System.out.println(rings.charAt(i+1));
            int index=Integer.parseInt(""+rings.charAt(i+1));
            //System.out.println(index);
            
            
            if(rings.charAt(i)=='R')
                R[index]++;
            else if(rings.charAt(i)=='G')
                G[index]++;
            else if(rings.charAt(i)=='B')
                B[index]++;
            //System.out.println(index+" R="+R[index]+" G="+G[index]+" B="+B[index]+"\n");
            
        }
        
        int count=0;
        
        for(int i=0; i<numRings; i++)
        {
            if(R[i]>=1 && G[i]>=1 && B[i]>=1)
                count++;
        }
        return count;
    }
}
