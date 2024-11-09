package homeworkLoop;

//Напишите программу на Java, которая выводит таблицу умножения для числа 7 от 1 до 10, используя циклы.

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;
        int startScale = 1;
        int finishScale = 10;
        int total = 0;

        for( ; startScale <= finishScale; startScale++) {
            total = startScale * number;
            System.out.println(number + " * " + startScale + " = " + total);

        }
    }
}
