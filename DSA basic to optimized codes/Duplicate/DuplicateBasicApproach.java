package com.company;

public class DuplicateBasicApproach {
    private static void dup( int arr[] ) {
        int flag=0;
        for(int i=0; i<arr.length;i++)
            for(int j=i+1; j<arr.length;j++)
                if(flag==0)
                    if(arr[i]==arr[j]){
                        System.out.println("duplicate = "+ arr[i]);
                        flag=1;
                    }
    }
    public static void main(String args[]) {
        int arr[]={2,5,9,6,9,3,8,9,7,1};
        dup(arr);
    }
}
