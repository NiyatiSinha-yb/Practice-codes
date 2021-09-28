//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
//time complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean res=false;
        List<Integer> ls = new ArrayList<Integer>();
        for(int ele : arr)
        {
            //ls.add(ele);
                if(ele%2==0)
                {

                    if(ls.contains(ele/2) || ls.contains(ele*2))
                    {
                        //System.out.println(ele+","+ele*2+","+ele/2);
                        res=true;
                        break;
                    }
                }
                else
                {
                    if(ls.contains(ele*2))
                    {
                        //System.out.println(ele+","+ele*2);
                        res=true;
                        break;
                    }
                }
            
            ls.add(ele);
        }
        //System.out.println(ls);
        return res;
    }
}
