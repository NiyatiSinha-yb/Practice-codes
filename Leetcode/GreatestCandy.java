//Time Complexity: O(n)
//Spcae Complexity: O(n)
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/

class GreatestCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> toffeeResult = new ArrayList<Boolean>();
        int max=0;
        for(int i=0; i< candies.length;i++)
        {
            if(candies[i]>max)
                max=candies[i];
        }
        for(int i=0; i< candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                toffeeResult.add(true);
            else
                toffeeResult.add(false);
        }
        return toffeeResult;
    }
}
