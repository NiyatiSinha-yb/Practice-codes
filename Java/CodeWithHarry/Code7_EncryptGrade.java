// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0); 
        char encryptedGrade=(char)(grade+8);
        System.out.println("Your encrypted grade = "+encryptedGrade);
        
    }
}
