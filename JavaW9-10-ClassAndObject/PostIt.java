public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public void print() {
        int postitSize = 40;
        for (int i = 0; i < (postitSize / 2) - backgroundColor.length(); i++) {
            System.out.print("-");
        }
        System.out.print(backgroundColor);
        for (int i = 0; i < (postitSize / 2) - backgroundColor.length(); i++) {
            System.out.print("-");
        }
        System.out.println("|");

        for (int i = 0; i < (postitSize / 2) - text.length(); i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int i = 0; i < (postitSize / 2) - text.length(); i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < (postitSize / 2) - textColor.length(); i++) {
            System.out.print("-");
        }
        System.out.print(textColor);
        for (int i = 0; i < (postitSize / 2) - textColor.length(); i++) {
            System.out.print(" ");
        }
        System.out.println();

    }

}
