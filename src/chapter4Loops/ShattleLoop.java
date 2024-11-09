package chapter4Loops;

public class ShattleLoop {
    /*В Японии числа 4 и 9 считаются несчастливыми. Вам нужно
пронумеровать 100 космических шаттлов для перевозки людей на Марс
так, чтобы в номерах шаттлов не попадалось несчастливых чисел.
Напишите функцию, которая выводит все номера таких шаттлов.
         */
    public static void main(String[] args) {
        int shattleStart = 1;
        int shattleFinish = 110;

        for ( ; shattleStart <= shattleFinish; shattleStart++) {

            if (!String.valueOf(shattleStart).contains("4") && !String.valueOf(shattleStart).contains("9"))
                System.out.println(shattleStart);

//
//            int intermediateValue = shattleStart / 10;
//            int percentFromNumber = shattleStart % 10;
//
//
//            if (shattleStart != 4 && shattleStart != 9 && intermediateValue != 4 && intermediateValue != 9 && percentFromNumber != 4
//                    && percentFromNumber != 9) {
//                System.out.println(shattleStart);
//            }

        }

    }
}
