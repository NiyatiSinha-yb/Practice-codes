import java.lang.*;
import java.util.*;

public class StdinAndStdout {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
         Scanner scanner = new Scanner(System.in);
         int userInt1 = scanner.nextInt();
         int userInt2 = scanner.nextInt();
         scanner.close();
         System.out.println(userInt1);
         System.out.println(userInt2);
        
    }
}
