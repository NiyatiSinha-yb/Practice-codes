//5998. Maximum Split of Positive Even Integers

class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum%2==1)
            return new ArrayList<Long>();
        
        ArrayList<Long> list=new ArrayList<>();
        split((long)finalSum,(long) 0, list);
        
        return list;
            
        
    }
    void split(long finalSum, long prev, ArrayList list)
    {
        if(prev>=finalSum)
        {
            list.remove(prev);
            list.add(prev+finalSum);
            return;
        }
        prev+=2;
        list.add(prev);
        split(finalSum-prev, prev, list);
    }
}
