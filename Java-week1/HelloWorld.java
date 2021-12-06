public class HelloWorld {
    public static void main (String [] args) {
        int myNumber;
        myNumber = 5;
        myNumber = myNumber + 15;

        int i = 1;
        byte b = 2;
        char c = 4;
        double d = 2.5d;
        float f = 5f;
        int myNum2 = (int) (5d/2.);

        //binary vs unary
        // binary op1 + - * / % op2
        // unary ! ++ -- op1 ++ --

        i = i + 1;

        int aa = 5;
        int bb = 9;
       // int max = a > bb ? aa ++;
        //System.out.println("Max is" + max);
        // Operace
        System.out.println(myNum2);
        System.out.println(++i); // prida a vytiskne
        System.out.println(i++); // vytiskne a pak prida
        System.out.println(myNumber);
        System.out.println(myNumber % 3); // 20 - (20 / 3)

        // if Else

        int number = 6;

        if (number % 2 == 0 ) {
            System.out.println("Sude");
        } else  {
            System.out.println("Liche");
        }


        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Sude a 3 ");
        } else if (number % 2 == 0 ){
            System.out.println("Sude");
        }


    }

}
