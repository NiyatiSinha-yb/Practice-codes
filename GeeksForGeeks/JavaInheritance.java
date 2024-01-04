//Java Inheritance
//https://www.geeksforgeeks.org/problems/java-inheritance/1?page=1&difficulty=School&status=unsolved&sortBy=accuracy

//Time Complexity: O(1)
//Space complexity: O(1)

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}

public class Sol{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        cls2 obj=new cls2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        //String tilde=sc.next();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
        //System.out.println("~");
        }
    }
}


// } Driver Code Ends
//User function Template for Java
class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int p,int q)
    {
        //Add your code here.
        add(p*p,q*q);
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
