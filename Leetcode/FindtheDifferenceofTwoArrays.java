//5268. Find the Difference of Two Arrays
//https://leetcode.com/contest/weekly-contest-286/problems/find-the-difference-of-two-arrays/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> res =new ArrayList<List<Integer>>();
        
        Set <Integer> A = new HashSet<>();
        for(int i: nums1)
        {
            A.add(i);
        }
        
        Set <Integer> B = new HashSet<>();
        for(int i: nums2)
        {
            B.add(i);
        }
        
        Set <Integer> union= new HashSet<Integer>(A);
        union.addAll(B);
        
        List <Integer> onlyA= new ArrayList<Integer>(union);
        onlyA.removeAll(B);
        
        List <Integer> onlyB= new ArrayList<Integer>(union);
        onlyB.removeAll(A);
        
        res.add(onlyA);
        res.add(onlyB);
        
        return res;
    }
}
