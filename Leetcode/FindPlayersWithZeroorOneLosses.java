//https://leetcode.com/contest/weekly-contest-287/problems/find-players-with-zero-or-one-losses/
//5235. Find Players With Zero or One Losses

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        TreeMap <Integer,Integer> playerVsLost= new TreeMap <Integer,Integer>(); //Lost matches will add 1 won will add 0
        for(int i=0; i<matches.length; i++)
        {
            if(!playerVsLost.containsKey(matches[i][0]))
            {
                playerVsLost.put(matches[i][0],0);
            }
            if(!playerVsLost.containsKey(matches[i][1]))
            {
                playerVsLost.put(matches[i][1],-1);
            }
            else
                playerVsLost.put(matches[i][1],playerVsLost.get(matches[i][1])-1);
            //System.out.println(i+"th Mappings are: " + playerVsLost);
            
        }
        
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        List<Integer> ele1= new ArrayList<Integer>();
        List<Integer> ele2= new ArrayList<Integer>();
        //System.out.println("Initial Mappings are: " + playerVsLost);
        
        for (Map.Entry mapElement : playerVsLost.entrySet()) {
            
            
             if((int)mapElement.getValue()==0)
             {
                 ele1.add((int)mapElement.getKey());
             }
             if((int)mapElement.getValue()==-1)
             {
                 ele2.add((int)mapElement.getKey());
             }
        }
        res.add(ele1);
        res.add(ele2);
        return res;
    }
}
