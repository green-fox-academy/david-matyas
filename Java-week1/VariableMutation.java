public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b - 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        d = e ^ 3;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            System.out.println("f1 is greater than f2");
        } else {
            System.out.println("f1 is smaller than f2");
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (g2*2 > g1) {
            System.out.println("2*G2 is greater than G1");
        } else {
            System.out.println("2*G2 is smaller than G1");
        }
        int h = 12;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h % 11 == 0 ) {
            System.out.println("Yes" + h%11);
        } else {
            System.out.println("No"  + h%11);
        }
        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        if ((i1 > i2*i2) && (i1 < i2*i2*i2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}
