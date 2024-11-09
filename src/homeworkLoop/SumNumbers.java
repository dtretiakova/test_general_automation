package homeworkLoop;

//Напишите программу на Java, которая находит сумму всех чисел от 1 до 100,
// исключая числа, кратные 5, используя циклы и операторы условия.

public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);

     }
}

