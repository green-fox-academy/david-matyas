import java.util.Locale;

public class StringBegining {
    public static void main(String[] args) {
        String s = "   wo  rd    ";
        String s1 = "wordiestword";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        if (s.startsWith("w")) { //s.endsWith()
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(s.concat(s1.toUpperCase()));
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf("o"));
        System.out.println(s.trim()); // delete space on begining and end

    }
}
