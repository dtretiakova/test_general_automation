package arrays;

import java.util.Scanner;

public class DaysOfWeekMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek daysOfTheWeek = new DaysOfTheWeek();
        int numberOfDay;
       do {
           System.out.println("Please enter number of the day you want: ");
          numberOfDay = scanner.nextInt();
           daysOfTheWeek.setDayOfTheWeek(numberOfDay);
        } while (numberOfDay >= 1 && numberOfDay <= 7);
    }
}
