public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int tempor = 0;

        System.out.println("Variables a= " + a);
        System.out.println("Variables b= " + b);

        tempor = a;
        a = b;
        b = tempor;

        System.out.println("Variables a= " + a);
        System.out.println("Variables b= " + b);


    }
}
