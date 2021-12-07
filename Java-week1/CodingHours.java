public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int attendeeHoursDaily = 6;
        int semesterWeeks = 17;
        int attendeeHoursWeekly = attendeeHoursDaily * 5;
        int workHoursWeek = 52;
        double codingShare = (attendeeHoursWeekly / (double) workHoursWeek) * 100 ;
        System.out.println("Attendee spent by coding " + attendeeHoursWeekly * semesterWeeks + " hours");
        System.out.println("Percentage of coding hours in week is " + codingShare + " %");

    }
}
