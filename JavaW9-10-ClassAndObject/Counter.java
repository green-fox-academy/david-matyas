public class Counter {
    int counter = 0;
    int number = 1;

    public Counter() {
        this.counter = 1;
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void add() {
        counter += number;
        System.out.println(counter);
    }

    public void add(int number) {
        counter += number;
        System.out.println(counter);
    }

    public void get() {
        System.out.println(counter);
    }

    public void reset() {
        counter = 0;
    }
}
