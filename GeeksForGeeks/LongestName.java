//Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//https://practice.geeksforgeeks.org/problems/display-longest-name0853/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
 
class GFG {
    String longest(String names[], int n) {
        int max=0;
        int index=0;
        for(int i=0; i<names.length; i++)
        {
            if(names[i].length()>max){
                max=names[i].length();
                //System.out.println(names[i]);
                index=i;
            }
        }
        return names[index];
    }
}
