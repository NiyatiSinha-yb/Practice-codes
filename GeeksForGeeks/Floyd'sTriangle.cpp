//Floyd's triangle
//https://www.geeksforgeeks.org/problems/floyds-triangle1222/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(n^2)
//Space complexity: O(1)

//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    void printFloydTriangle(int N)
    {
        // Write Your Code here
        int k=1;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<=i; j++)
            {
                cout<<(k++);
                cout<<" ";
            }
            cout<< endl;
        }
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin >> N;
        Solution ob;
        ob.printFloydTriangle(N);
    }
    return 0;
}
// } Driver Code Ends
