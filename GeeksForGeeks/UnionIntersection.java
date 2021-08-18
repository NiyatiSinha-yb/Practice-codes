//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1#
//User function Template for Java
//Time Complexity: O((n+m)log(n+m)) -->due to sorting
//Space Complexity O(n+m) --> union array
class UnionIntersection{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int unionElement=-1;
        int i,j,k;
        int union[]=new int[n+m];
        for(i=0,j=0; i<a.length && j<b.length;)
        {
            if( unionElement>=0 && union[unionElement]==a[i])
            {
              //intersection or repeated element
                i++;
            }
            else if(unionElement>=0 && union[unionElement]==b[j])
            {
                //intersection or repeated element
                j++;
            }
            else if(a[i]<b[j])
            {
                //union
                union[++unionElement]=a[i];
                i++;
            }
            else if(a[i]>b[j])
            {
              
                //union
                union[++unionElement]=b[j];
                j++;
            }
            else 
            {
              
                //union
                union[++unionElement]=a[i];
                i++;
                j++;
            }
        }
        if(i<a.length)
        {
          
                //union
            for(k=i;k<a.length;)
              if(union[unionElement]==a[k])
                  k++;
              else
                {
                    union[++unionElement]=a[k++];
                }
        }
        else if(j<b.length)
        {
            
            for(k=j;k<b.length;)
              if(union[unionElement]==b[k])
                  k++;
              else
                {
                    union[++unionElement]=b[k++];
                }
        }
        /*for(k=0;k<unionElement;k++)
        {
            System.out.println(union[k]);
        }*/
        return unionElement+1;
    }
}
