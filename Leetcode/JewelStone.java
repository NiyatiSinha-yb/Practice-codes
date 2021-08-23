//https://leetcode.com/problems/jewels-and-stones/submissions/
//Time Complexity:
//Space Complexity:O(1)

class JewelStone {
    public int numJewelsInStones(String jewels, String stones) {
        int countJewel=0;
        for(int i=0; i<stones.length();i++)
        {
            if(jewels.contains(""+stones.charAt(i)))
               countJewel++;
        }
        return countJewel;
    }
}
