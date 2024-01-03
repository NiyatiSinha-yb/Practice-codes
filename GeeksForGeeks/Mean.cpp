//Mean
//https://www.geeksforgeeks.org/problems/mean0021/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy
//Time Complexity: O(N)
//Space complexity: O(1)

//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    int mean(int N , int A[]) {
        // code here
        int sum=0;
        for(int i=0; i<N; i++)
        {
            sum+=A[i];
        }
        return sum/N;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin>>N;
        int A[N];
        for(int i=0 ; i<N ; i++)
            cin>>A[i];

        Solution ob;
        cout << ob.mean(N,A) << endl;
    }
    return 0;
}
// } Driver Code Ends
