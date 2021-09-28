//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
//Time Comlexity: O(n)
//Space Complexxity: O(1)

class Solution {
    public boolean validMountainArray(int[] arr) {
        int slope=1;
        int prev=Integer.MIN_VALUE;
        if(arr.length<=2)
            return false;
        for(int ele: arr)
        {
            
           switch(slope)
           {
               case 1: //increasing
                        if(ele>prev)
                        {
                            prev=ele;
                        }
                        else if(ele==prev)
                        {
                            return false;
                        }
                        else
                        {
                            //previous ele is peak
                            //System.out.println(arr[0]+","+ele);
                            if(arr[1]==ele) // if the first element is peak i.e zeroth index
                                return false;
                            prev=ele;
                            slope=-1;
                        }
                        break;
               case -1: if(ele<prev)
                        {
                            prev=ele;
                        }
                        else
                        {
                            return false;
                        }
                        break;
           }
        }
        if(slope!=-1)
            return false;
        return true;
    }
}
