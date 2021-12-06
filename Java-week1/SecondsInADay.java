public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int endHours = 24 - (currentHours+1);
        int endMinutes = 60 - (currentMinutes+1);
        int endSeconds = 60 - currentSeconds;
        int endInSec = (endHours * 3600) + (endMinutes *60) + endSeconds ;
        System.out.println("Zbyva " + endHours + " hodin " +  endMinutes  + " minut " +  endSeconds + " sekund");
        System.out.println("Zbyva " + endInSec + " sekund");
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above


    }
}
