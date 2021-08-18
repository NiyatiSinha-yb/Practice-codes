/*Considering order of elements is important */
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
//Assuming we need to maintain the order, thus I am using extra space
//Time Complexity: O(n)
//Space complexity: O(n)
import java.io.*;
import java.util.*;
class Arrange {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int arr[]= new int[sc.nextInt()];
	    int posStack[]= new int[arr.length];
	    int posIndex=0;
	    
	    int temp=0;
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int frontNegEnd=0, BackPosStart=arr.length-1;
	    for(int i=0 ; i<arr.length; i++)
	    {
	        if(arr[i]>0)
	        {
	            posStack[posIndex++]=arr[i];
	        }
	        else if(arr[i]<0)
	        {
	            arr[temp++]=arr[i];
	        }
	    }
	    for(int i=temp,j=0 ; i<arr.length; i++)
	    {
	        arr[i]=posStack[j++];
	    }
	    
	    for(int i=0; i<arr.length; i++)
	    {
	       System.out.print(arr[i]+",");
	    }
	}
}
