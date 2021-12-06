import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Default";

        System.out.println("Name:");
        name = scanner.next();
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        System.out.println("Hello, " + name );
    }
}
