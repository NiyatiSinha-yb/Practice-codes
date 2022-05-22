//6075. Maximum Bags With Full Capacity of Rocks
//https://leetcode.com/contest/weekly-contest-294/problems/maximum-bags-with-full-capacity-of-rocks/
//Time Ciomplexity: O(n log n)
//Spcae Complexity : O()

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int vacancy[]=new int[capacity.length];
        for(int i=0; i<capacity.length; i++)
        {  
            vacancy[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(vacancy);
        
        
        int full=0;
        
        for(int i=0; i<capacity.length; i++)
        {
            
            if(vacancy[i]>0)
            {
                
               
                if(vacancy[i]>additionalRocks)
                    break;
                else
                {
                    rocks[i]+=vacancy[i];
                    additionalRocks-=vacancy[i];
                    full++;
                    System.out.println(i+" is full, left ="+additionalRocks);
                }
                
            }
            else if(vacancy[i]==0)
                full++;
                
        }
        return full;
        
    }
}
