//https://leetcode.com/contest/weekly-contest-288/problems/largest-number-after-digit-swaps-by-parity/
//6037. Largest Number After Digit Swaps by Parity

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int largestInteger(int num) {
        String n=""+num;
        int odd=0;
        int even=0;
        String res="";
        
        for(int i=0; i<n.length(); i++)
        {
            if(Integer.parseInt(""+n.charAt(i))%2==1)
                odd++;
            else
                even++;
        }
        
        Integer o[]=new Integer[odd];
        Integer e[]=new Integer[even];
        
        // int copy_o[]=new int[odd];
        // int copy_e[]=new int[even];
        
        //System.out.println(odd);
        //System.out.println(even);
        
        odd=0;
        even=0;
        
        for(int i=0; i<n.length(); i++)
        {
            if(Integer.parseInt(""+n.charAt(i))%2==1)
            {
                //System.out.println(odd+ ", "+ i);
                o[odd++]=Integer.parseInt(""+n.charAt(i));
                //copy_o[odd++]=Integer.parseInt(""+n.charAt(i));
                
                
            }
            else
            {
                //System.out.println(even+ ", "+ i);
                e[even++]=Integer.parseInt(""+n.charAt(i));
                //copy_e[even++]=Integer.parseInt(""+n.charAt(i));
                
            }
        }
        
         Arrays.sort(e,Collections.reverseOrder());
         Arrays.sort(o,Collections.reverseOrder());
         int evenIndex=-1;
         even=0;
         odd=0;
        
        for(int i=0; i<n.length(); i++)
        {
            if(Integer.parseInt(""+n.charAt(i))%2==1)
            {
                res+=o[odd++];
                //System.out.println(odd+ ", "+ i);
                
                
                
            }
            else
            {
                res+=e[even++];
                //System.out.println(even+ ", "+ i);
                
                
            }
        }
        
        
        
//         for(int i=0; i<n.length(); i=i+2)
//         {
//             //System.out.println(e[even]+ " sorted compare actual "+ Integer.parseInt(""+n.charAt(i)));
//             if(e[even++]>Integer.parseInt(""+n.charAt(i)))
//             {
//                 evenIndex=i;
//                 break;
//             }
//         }
        
//         //System.out.println(evenIndex+ "= evenIndex");
        
//         Arrays.sort(o,Collections.reverseOrder());
//         int oddIndex=0;
//         odd=0;
        
        
//         for(int i=1; i<n.length(); i=i+2)
//         {
//             //System.out.println(o[odd]+ " sorted compare actual "+ Integer.parseInt(""+n.charAt(i)));
//             if(o[odd++]>Integer.parseInt(""+n.charAt(i)))
//             {
//                 oddIndex=i;
//                 break;
//             }
//         }
        
//         //System.out.println(oddIndex+ "= oddIndex");
        
        
//         odd=0;
//         even=0;
        
//         for(int i=0;i<n.length(); i++)
//             {
//                 if(i%2==0)
//                     res+=""+e[even++];
                    
//                 else
//                     res+=""+o[odd++];
//             }
        
       //if only either add indexes or even indexes could be swapped 
//         if(evenIndex<oddIndex)
//         {
//             for(int i=0;i<n.length(); i++)
//             {
//                 if(i%2==0)
//                     res+=""+e[even++];
                    
//                 else
//                     res+=""+copy_o[odd++];
//             }
//         }
//         else
//         {
//             for(int i=0; i<n.length(); i++)
//             {
//                 if(i%2==0)
//                     res+=""+copy_e[even++];
                    
//                 else
//                     res+=""+o[odd++];
//             }
//         }
        
        //res=""+0;
        return Integer.parseInt(res);
        
    }
}
