/*Considering order of elements is not important */
//Time Complexity O(n)
//Space Complexity O(1)

import java.io.*;
import java.util.*;
class FirstNegThenPos {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int arr[]= new int[sc.nextInt()];
	    int temp,i;
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int frontNegEnd=0, BackPosStart=arr.length-1;
	    for(i=0 ; i<arr.length; i++)
	    {
	        if(arr[i]<0)
	        {
	            temp=arr[i];
	            arr[i]=arr[frontNegEnd];
	            arr[frontNegEnd++]=temp;
	        }
	        /*else{
	            int temp=arr[i];
	            arr[i]=arr[BackPosStart];
	            arr[BackPosStart--]=temp;
	        }*/
	    }
	    for(i=0; i<arr.length; i++)
	    {
	       System.out.print(arr[i]+",");
	    }
	}
}
