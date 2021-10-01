//Time Complexity: O(n^2)
//Space Complexity: O(n)
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set <Integer> unique=new HashSet<>();
        int i;
        
        for(i=0; i<nums.length; i++)
            unique.add(nums[i]);
        
        ArrayList<Integer> missed= new ArrayList<>();
        
        for(i=1; i<=nums.length; i++)
            if(!unique.contains(i))
                missed.add(i);
        
        //System.out.println(unique);
        //System.out.println(missed);
        
        return missed;
    }
}
