//https://leetcode.com/problems/create-target-array-in-the-given-order/
//Time Complexity: O(n^2)
//Space Complexity: O(n)

class TargetOrderArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[]=new int[nums.length];
        int last;
        for(int i=0; i<nums.length; i++)
        {
           last= i;
           while(last!=index[i] && last>0)
           {
               res[last]=res[--last];
           }
            res[index[i]]=nums[i];
            /*for(int j=0; j<nums.length; j++)
            {
                System.out.print(res[j]);
            }
            System.out.println();*/
        }
        return res;
    }
}
