import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jmeno ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Hello  */" + name);
        //System.out.println("Hello \"" + name + "\") ; // preskocit \


    }
}
