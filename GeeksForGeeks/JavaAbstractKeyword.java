//Java Abstract keyword
//https://www.geeksforgeeks.org/problems/java-abstract-keyword/1?page=1&difficulty=School&status=unsolved,attempted&sortBy=accuracy
//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.Scanner;
abstract class A 
{
    int prod;
    abstract void m1(int p,int q);
    void m2()
    {
        System.out.println(prod);
    }
}

public class AbstractDemo 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        B b = new B();
        b.m1(a1,a2);
        b.m2();
        }
    }
}

// } Driver Code Ends
//User function Template for Java

class B extends A 
{
    void m1(int p,int q) {
       // Add your code here.
       prod=(p*q);
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
