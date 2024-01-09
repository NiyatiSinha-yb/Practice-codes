//Replace all 0's with 5
//https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?page=1&difficulty=School,Basic&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(log n)
//Space complexity: O(n)

//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int n) {
        // Your code here
        int sum=0; 
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            if(rem==0)
                rem=5;
            sum=sum*10+rem;
            n=n/10;
        }
        int res=0;
        while(sum!=0)
        {
            rem=sum%10;
            res=res*10+rem;
            sum=sum/10;
        }
        return res;
    }
}
