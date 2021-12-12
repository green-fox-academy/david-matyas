import java.util.Arrays;


public class ArraysTest {
    public static void main(String[] args) {


        int position = 0;
        String[] names = {"david", "petr", "Jan"};
        int[] age = {20, 10, 25};


        String[] numbers = new String[12];
        Arrays.sort(age);

        for (int i = 0; i < age.length; i++) {
            System.out.println(numbers[i]);
        }
        while (position <= 2) {
            System.out.println("Name:" + names[position] + " age:" + age[position]);
            position++;
        }


        int[] cislo = new int[12];
        System.out.println(cislo[position]);
        int[][] yearsMonths = new int[12][4];
        int[][] yearsMonth = {{1,2},{2,3}};
        // position
        yearsMonths[1][2] = 15;

        for (int i = 0; i < yearsMonths.length; i++) {
            for (int j = 0; j < yearsMonths[i].length; j++) {
                System.out.println(i + j+ yearsMonths[i][j]);
            }
        }

    }
}
// declare array
// List of intregers, strings
// define size when creating
// could have more dimensions
// indexing
// indexing begins from 0
// v poli může být jen jeden druh dat


