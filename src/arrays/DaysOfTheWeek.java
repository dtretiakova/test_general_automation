package arrays;

public class DaysOfTheWeek {
    String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private int dayNumber;

    public void setDayOfTheWeek(int dayNumber) {
        for (int i = 0; i < daysOfTheWeek.length; i++) {
            if (i == dayNumber - 1) {
                System.out.println("Corresponding day: " + daysOfTheWeek[i]);
            }
        }
    }


}
