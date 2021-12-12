public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter´s Law: It you expect, even when you take into account Hofstadter´s Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!

        System.out.println(quote);

        // create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder str
                = new StringBuilder();

        str.append("GFG");

        // print string
        System.out.println("String = "
                + str.toString());

        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = "
                + str1.toString());

        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2
                = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = "
                + str2.capacity());

        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3
                = new StringBuilder(str1.toString());

        // print string
        System.out.println("String3 = "
                + str3.toString());

    }
}
