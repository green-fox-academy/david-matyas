import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
        int[] field = {34, 12, 24, 9, 5};
        System.out.println(Arrays.toString(advancedBubble(field, true)));
        System.out.println(Arrays.toString(advancedBubble(field, false)));
      //  System.out.println(advancedBubble(field, false));

    }


    public static int[] advancedBubble(int[] field, boolean ascDesc) {
        String[] storage = new String[field.length];
        int temp;
        for (int i = 0; i < field.length; i++) {
            for (int j = i + 1; j < field.length; j++) {
                if((field[i] > field[j] && ascDesc) || (field[i] < field[j] && !ascDesc)) {
                temp  = field[i];
                field[i] = field[j];
                field[j] = temp;
                }
            }
        }

//
//        if (ascDesc == false) {
//
//
//            Arrays.sort(field);
//            for (int i = 0; i < field.length; i++) {
//                if (i == field.length-1) {
//                    storage += field[i] + "]";
//
//                } else {
//                    storage += field[i] + ", ";
//                }
//            }
//
//        } else
//        {
//            Arrays.sort(field);
//            for (int i = field.length-1; i >= 0; i--) {
//                if (i == 0) {
//                    storage += field[i] + "]" ;
//
//                } else {
//                    storage += field[i] + ", ";
//                }
//            }
//
//        }


        return field;
    }
}


