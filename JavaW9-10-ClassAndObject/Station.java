public class Station {
    int gasAmount = 10000;

    public void refill(Car car) {
        gasAmount -= car.capacity - car.gasAmount;
        car.refill();

    }
}
