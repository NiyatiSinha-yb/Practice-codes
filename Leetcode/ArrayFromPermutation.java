//time Complexity: O(n)
//Space Complexity: O(n)
//https://leetcode.com/problems/build-array-from-permutation/submissions/

class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int PermutatedArray[]=new int[nums.length];
        for(int i=0; i<nums.length;i++)
            PermutatedArray[i]=nums[nums[i]];
        return PermutatedArray;
    }
}
