/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;
class MonkRotation_Array1{
    
    static Scanner sc = new Scanner (System.in);

    static void makeArray(int size, int k){
        sc.nextLine();
        int arr[]=new int[size];
        String content= sc.nextLine();
        String[] elements= content.split(" ");
        int len=0;

        for(int i=k;i<size;i++)
            arr[i]=Integer.parseInt(elements[len++]);

        for(int i=0;i<k;i++)
            arr[i]=Integer.parseInt(elements[len++]);

        for(int i=0; i<size ; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            makeArray(sc.nextInt(), sc.nextInt());
        }   //int size= sc.nextInt();
            //int k=sc.nextInt();
            //makeArray(size,k);
    }
}


