public class Car {
    int gasAmount = 0;
    int capacity = 100;

    public void carMove(int distance){
        gasAmount -= (distance/100)*5;
    }
    public void refill(){
        gasAmount = capacity;
    }
}
