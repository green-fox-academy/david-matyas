public class PrintEven {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 500) {
            counter++;
            if (counter % 2 == 0) {
                counter++;
            }
            System.out.println(counter);

        }
    }
}
