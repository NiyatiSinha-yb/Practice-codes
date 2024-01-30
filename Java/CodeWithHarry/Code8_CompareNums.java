// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt(); 
        System.out.println("num1 > num2 = "+(num1 > num2) );
        System.out.println("num1 < num2 = "+(num1 < num2) );
        System.out.println("num1 == num2 = "+(num1 == num2) );
    }
}
