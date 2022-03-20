//6027. Count Hills and Valleys in an Array
class Solution {
    public int countHillValley(int[] nums) {
        int hills=0;
        int valleys=0;
        int prev=0;
        int next=0;
        int hill=0; // 1=hill -1=valley 0=none
        int flag=-1; //flag=1 then don't count
        
       // int prev=0; //0 none 1->hill -1-> valley
        for(int i=1; i<nums.length-1; i++)
        {
            prev=i-1;
            next=i+1;
            while(nums[prev] == nums[i]){
                {
                    if(prev>0)
                        prev-=1;
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==1)
            {
                flag=-1;
                continue;
            }
            while(nums[next] == nums[i])
            {
                

                if(next<nums.length-1)
                    next+=1;
                
                else
                {
                    flag=1;
                    break;
                }
            }
            if(flag==-1)
            {
                if(nums[prev]>nums[i] && nums[i]<nums[next] && hill!=-1){

                    hills++;
                    System.out.println(i+" is  valley ,");
                    hill=-1;
                }
                else if(nums[prev]<nums[i] && nums[i]>nums[next] && hill!=1){

                    valleys++;
                    System.out.println(i+" is  hill ,");
                    hill=1;
                }
//                 else
//                 {
//                     hill=0;
//                     System.out.println(i+" is  plain ,");

//                 }
            }
            flag=-1;
                
            
        }
        return hills+valleys;
    }
}
