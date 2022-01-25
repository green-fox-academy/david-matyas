public class TestCounter {
    String color;
    int width;
    int inkAmount;

    public void use(String color, int width) {
        inkAmount -= width * 10;
        System.out.println("Actual ink amount is " + inkAmount);
    }

}