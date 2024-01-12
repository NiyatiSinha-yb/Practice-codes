//Equal Sum and XOR
//https://www.geeksforgeeks.org/problems/equal-sum-and-xor/1?page=2&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//initial code
import java.util.*;

class EqualSumAndXor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a =sc.nextInt();
          
            GfG g=new GfG();
        
            System.out.println(g.countValues(a));
            t--;
        }
    }
}



// } Driver Code Ends


class GfG{
       /*you are required to complete this method */
	public int countValues(int n)
	{
            //Your code here
            int c=0;
            for(int i=0; i<=n; i++)
            {
                //System.out.println((n^i)+" "+(n+i));
                if((n^i)==(n+i))
                {
                    c++;
                }
            }
            return c;
	}
}
