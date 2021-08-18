/*Considering order of elements is not important */

import java.io.*;
import java.util.*;
class FirstNegThenPos {
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int arr[]= new int[sc.nextInt()];
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int frontNegEnd=0, BackPosStart=arr.length-1;
	    for(int i=0 ; i<arr.length; i++)
	    {
	        if(arr[i]<0)
	        {
	            int temp=arr[i];
	            arr[i]=arr[frontNegEnd];
	            arr[frontNegEnd++]=temp;
	        }
	        /*else{
	            int temp=arr[i];
	            arr[i]=arr[BackPosStart];
	            arr[BackPosStart--]=temp;
	        }*/
	    }
	    for(int i=0; i<arr.length; i++)
	    {
	       System.out.print(arr[i]+",");
	    }
	}
}
