//https://practice.geeksforgeeks.org/problems/java-1-d-and-2-d-array2952/1/?category[]=Arrays&category[]=Arrays&page=1&query=category[]Arrayspage1category[]Arrays#
//Time Complexity: O(N2)
//Auxiliary Space: O(1)??

class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> diagSum = new ArrayList <Integer>();
        int max=Integer.MIN_VALUE;;
        int sumLeft=0;
        //int sumRight=0;
        for(int i=0; i<n; i++)
            {
                sumLeft+=a[i][i];
                if(max<b[i])
                {
                    max=b[i];
                }
               // sumRight+=a[i][n-1-i];
            }
        diagSum.add(sumLeft);
        diagSum.add(max);
        return diagSum;
    }
    
}
