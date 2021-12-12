import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(50);
        grades.add(55);
        System.out.println(grades);

        for(int i = 0; i<grades.size();i++)
            System.out.println("Ahoj :"+ i + grades.size());


    }
}
