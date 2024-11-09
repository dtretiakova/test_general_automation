package arrays;

//Есть массив типа int из 12 елементов, каждий елемент соответствует месяцу,
// заполнить в цикле соответствующим количестволм дней.

public class CalendarMonthsDayArrays {
    public static void main(String[] args) {

        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nameMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i]; j++) {
                System.out.println(j + 1 + " " + nameMonths[i]  + "\n");
            }
        }
    }
}
