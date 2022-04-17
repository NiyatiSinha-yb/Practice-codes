//6071. Minimum Rounds to Complete All Tasks
//https://leetcode.com/contest/weekly-contest-289/problems/minimum-rounds-to-complete-all-tasks/
//Time Complexity: O(number of unique elements in tasks)
//Space Complecity: O(number of unique elements in tasks)
class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap <Integer, Integer> valFreq= new HashMap<>();
        for(int i=0; i<tasks.length; i++)
        {
            if(valFreq.containsKey(tasks[i]))
            {
                valFreq.put(tasks[i],valFreq.get(tasks[i])+1);
            }
            else
            {
                valFreq.put(tasks[i],1);
            }
        }
        
        System.out.println(valFreq);
        int level=0;
        
        for (Map.Entry ele : valFreq.entrySet()) 
        {
            
            System.out.println(ele.getValue());
            // if(ele.getValue()%3==0 || ele.getValue()%2==0 || (ele.getValue()%3)%2==0)
            // {
            //     level++;
            // }
            
            int val=(int)ele.getValue();
            while(val>=2)
            {
                
                if(val%3==0)
                {
                    
                    level+=val/3;
                    System.out.println(ele.getKey() +" is Divisible by 3: "+ level );
                    val=val%3;
                    
                }
                else if((val%3)%2==0)
                {
                    level+=val/3;
                    val=val%3;
                    level+=val/2;
                    val=val%2;
                    
                     System.out.println(ele.getKey() + " is Divisible by 3 then 2: "+ level );
                }
                else if((val%3+3)%2==0)
                {
                    level+=val/3;
                    level--;
                    val=val%3+3;
                    level+=val/2;
                    val=val%2;
                    
                     System.out.println(ele.getKey() +" is Divisible by 3 then 2 edge: "+ level );
                }
               
                else if((val%2)%3==0 )
                {
                    System.out.println(val+" , "+ val%2);
                    
                    level+=val/2;
                    val=val%2;
                    level+=val/3;
                    val=val%3;
                    
                     System.out.println(ele.getKey() + " is Divisible by 2 then 3: "+ level );
                }
                
                else if((val%2+2)%3==0)
                {
                    level+=val/2;
                    level--;
                    val=val%2+2;
                    level+=val/3;
                    val=val%3;
                    
                     System.out.println(ele.getKey() +" is Divisible by 2 then 3 edge: "+ level );
                }
                else if(val%2==0)
                {
                    level+=val/2;
                    System.out.println(ele.getKey()  + " is Divisible by 2: "+ level );
                    val=val%2;
                    
                }
                
                else
                    return -1;
                    
              
                
                
            }
            if(val!=0)
                return -1;
        }
        
        return level;
    }
}
