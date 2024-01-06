//Front-Back Transformation - copy
//https://www.geeksforgeeks.org/problems/front-back-transformation1659/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(n)
//Space complexity: O(1)

//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
string convert(string a);
int main()
{
    int t;
    cin>>t;
    while(t--)
        {
            string s;
            cin>>s;
            string ans=convert(s);
            cout<<ans<<endl;
            
        }
}

// } Driver Code Ends


string convert(string s)
{
    // code here.
    string str="";
    int ascii=0;
    char ch='a';
    for(int i=0; i<s.length(); i++)
    {
        //ascii=s.charAt(i);
        ch=s.at(i);
        if(ch>='A' && ch<='Z')
        {
            //System.out.println(ascii);
            //int temp='Z'-ch;
            //System.out.println("temp= "+temp+", "+ (char)temp);
            str+=(char)('Z'-ch+'A');
            // cout<<str;
            // cout<<"\n";
        }
        else
        {
            //System.out.println(ascii);
            str+=(char)('z'-ch+'a');
            // cout<<str;
            // cout<<"\n";
            //System.out.println("str= "+str);
        }
        
    }
        
        return str;
}
