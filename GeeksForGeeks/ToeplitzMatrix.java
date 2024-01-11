//Toeplitz matrix
//https://www.geeksforgeeks.org/problems/toeplitz-matrix/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
import java.util.*;


class Check_IsToepliz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T =  sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			int arr[][] = new int[N][M];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				arr[i][j] = sc.nextInt();
			}
			
			GfG g = new GfG();
			boolean b = g.isToepliz(arr,N,M);
			if(b == true)
				System.out.println(1);
			else
				System.out.println(0);
			
		T--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][], int N, int M)
    {
        // Your code here
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(i+1<N && j+1<M)
                if(mat[i][j]!=mat[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}
