//Time Complexity: O(jewels.length()+stones.length())
//Space Complexity: O(jewels.length())
//https://leetcode.com/problems/jewels-and-stones/

class JewelHashing {
    public int numJewelsInStones(String jewels, String stones) {
        int countJewel=0;
        Set hashJewel= new HashSet();
        for(char j: jewels.toCharArray())
        {
           hashJewel.add(j);
        }
        for(char j: stones.toCharArray())
        {
            if(hashJewel.contains(j))
                countJewel++;
        }
        return countJewel;
    }
}
