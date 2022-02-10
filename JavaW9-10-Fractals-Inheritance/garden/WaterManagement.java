package garden;

public class WaterManagement {
    int waterAvailable = 10000000;

    public void watering(int number)
    {
        waterAvailable -= number;
    }

}
