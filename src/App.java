import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // This is a simple Java program that prints out some statements about Natty.

        int age;
        boolean isStudent = true; 
        age = 21;
        
        

        Scanner scanner = new Scanner (System.in);
       
        System.out.println("Enter your name: ");
                String name = scanner.nextLine();
        
        System.out.println("Enter you age");
                int Age = scanner.nextInt();
        System.out.println("Fuck you" + " " + name + "!");
        System.out.println("You are " + Age + " years old!");
        scanner.close();

    }
}