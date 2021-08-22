//time Complexity: O(n)
//Space Complexity: O(n)

class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int PermutatedArray[]=new int[nums.length];
        for(int i=0; i<nums.length;i++)
            PermutatedArray[i]=nums[nums[i]];
        return PermutatedArray;
    }
}
