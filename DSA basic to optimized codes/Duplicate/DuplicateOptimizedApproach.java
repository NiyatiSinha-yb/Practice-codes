package com.company;

public class DuplicateOptimizedApproach {
    private static void dup( int arr[] ) {
        int slowPointer=arr[0];
        int fastPointer=arr[0];

        do {
            //pointerupdation
            System.out.println("Pos slow= " + slowPointer+ ", Pos fast = "+ fastPointer);
            slowPointer = arr[slowPointer];
            fastPointer = arr[arr[fastPointer]];

        } while(slowPointer!=fastPointer);
        System.out.println("Pos slow= " + slowPointer+ ", Pos fast = "+ fastPointer);
        fastPointer=arr[0];

        while(slowPointer!=fastPointer) {
            slowPointer=arr[slowPointer];
            fastPointer=arr[fastPointer];
        }

        System.out.println("Duplicate = " + slowPointer);


    }
    public static void main(String args[]) {
        //int arr[]={2,5,9,6,9,3,8,9,7,1};
        //int arr[]={1,3,4,2,2};
        int arr[]={3,1,3,4,2};
        dup(arr);
    }
}
