//Time Complexity: O(n^2)
//Space Complexity: O(n)
//https://leetcode.com/submissions/detail/564095505/?from=explore&item_id=3270

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer> missed= new ArrayList<>();
        int val=1,i;
        for(i=0;i<nums.length; i++)
        {
            if(nums[i]>val)
            {
                //System.out.println(nums[i]+","+val);
                while(val<nums[i])
                    missed.add(val++);
                //System.out.println("="+val+","+nums[i]);
            }
            if(nums[i]==val)
            {
                //System.out.println("*"+val+","+nums[i]);
                //System.out.println("="+val);
                val++;
            }
        }
        //System.out.println(val);
        for(i=val;i<=nums.length; i++)
        {
            missed.add(i);
        }
        return missed;
    }
}
