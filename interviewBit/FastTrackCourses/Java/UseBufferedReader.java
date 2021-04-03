import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UseBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String firstLine=br.readLine();
        //String secondLine=br.readLine();
        
        int firstInt = Integer.parseInt(br.readLine());
        int secondInt = Integer.parseInt(br.readLine());
        
        //System.out.println(firstInteger);
        //System.out.println(secondInteger);
        System.out.print(firstInt+" ");
        System.out.println(secondInt);
        
        //your code goes here
    }
}
