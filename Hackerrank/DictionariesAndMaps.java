//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String name="";
        ArrayList<String> str=new ArrayList<String>();
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            str.add(in.next());
            num.add(in.nextInt());
            // Write code here
        }
        while(in.hasNext()){
            name=in.next();
            //if(str.contains(name))
                //System.out.println(name+"="+num.get(str.indexOf(name)));
                int index=str.indexOf(name);
                if(index!=-1)
                System.out.println(name+"="+num.get(index));
            else
                System.out.println("Not found");
            // Write code here
        }
        in.close();
    }
}
