//time Complexity: O(n)
//Spcae Complexity: O(2*n)
//https://leetcode.com/problems/shuffle-the-array/submissions/

class ShuffleArray{
    public int[] shuffle(int[] nums, int n) {
        int shuffledArr[]=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            shuffledArr[k++]=nums[i];
            shuffledArr[k++]=nums[i+n];
        }
        return shuffledArr;
    }
}
