//Java Override
//https://www.geeksforgeeks.org/problems/java-override/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.Scanner;
class Parent
{
    void show(int p) { System.out.print(p+" "); }
    void print(int q){
        System.out.print(q+" ");
    }
}

 
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int s=sc.nextInt();
        Parent obj1 = new Parent();
        obj1.show(p);
        obj1.print(q);
        Parent obj2 = new Child();
        obj2.show(r);
        obj2.print(s);
        }
    }
}



// } Driver Code Ends
//User function Template for Java


class Child extends Parent
{
    @Override
    void show(int p) { System.out.print(p+" "); }
    
    @Override
    void print(int q)
    {
        //Add your code here.
        System.out.println(q*q+" ");
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
