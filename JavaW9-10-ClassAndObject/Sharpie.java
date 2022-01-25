public class Sharpie {
    String color;
    int width;
    int inkAmount;
    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use(String color, int width) {
        inkAmount -= width * 10;
        System.out.println("Actual ink amount is " + inkAmount);
    }

    public void setInkAmount(int inkAmount) {
        this.inkAmount = inkAmount;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", inkAmount=" + inkAmount +
                '}';
    }
}
