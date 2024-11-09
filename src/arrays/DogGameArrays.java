package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Task1
// Массив char 10 елементов, заполнен нижними подчеркиваниями,
// На первой позиции стоит символ @,
// При вводе через сканнер клавишу D - собачка должна сдвинуться вправо на одну ячейку,
// При вводе клавишу A - влево на одну ячейку,
// Game over когда собачка дошла до конца массива.
//У собаки есть 100 единиц здоровья,
//За каждий шаг она теряет 5 единиц,
//Game over - когда здоровье меньше 0.
//На поле рандомно появляется бомбочка(-) и аптечка(+) = -40 xp/+40xp
//Генерируется один раз
//Каждий ход виводим xp собаки, и как виглядит путь.

public class DogGameArrays {
    public static void main(String[] args) {
        char[] life = {'@', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
        int healthPoint = 100;
        int dogIndex = 0;
        char iconHeal = '+';
        char iconBomb = '*';
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can use button D for moving forward or button A for moving back");
        Random random = new Random();

        int rdmArrayElementHeal = random.nextInt(1, life.length - 1);
        int rdmArrayElementBomb = random.nextInt(1, life.length - 1);
        while (rdmArrayElementHeal == rdmArrayElementBomb) {
            rdmArrayElementBomb = random.nextInt(1, life.length - 1);
        }

        addAdditionalFacility(rdmArrayElementHeal, life, iconHeal);
        addAdditionalFacility(rdmArrayElementBomb, life, iconBomb);

        while (healthPoint > 0 && life[life.length - 1] != '@') {
            String move = scanner.next();
            if (!move.equalsIgnoreCase("D") && !move.equalsIgnoreCase("A")) {
                System.out.println("You must enter only letter D or A");
                continue;
            }
            if (move.equalsIgnoreCase("D")) {
                deleteAdditionalFacility(life, dogIndex, iconHeal, iconBomb);
                dogIndex = moveForward(life, dogIndex);
            } else {
                dogIndex = moveBackward(life, dogIndex);
            }
            sumHealthPoint(dogIndex, healthPoint, rdmArrayElementHeal, rdmArrayElementBomb);
            System.out.println(Arrays.toString(life));
        }
        if (healthPoint <= 0) {
            System.out.println("Ohh no, game over!");
        } else {
            System.out.println("You win this game! Congrats!!");
        }

    }

    public static void sumHealthPoint(int dogIndex, int healthPoint, int rdmArrayElementHeal, int rdmArrayElementBomb) {
        int heal = 40;
        int bomb = 40;
        int healthPointStep = 5;

        if (dogIndex == rdmArrayElementHeal) {
            healthPoint = healthPoint + heal;
            System.out.println("You healed successfully");
        } else if (dogIndex == rdmArrayElementBomb) {
            healthPoint = healthPoint - bomb;
            System.out.println("Ohh no! You get in trouble");
        }
        healthPoint = healthPoint - healthPointStep;

        System.out.println("Your actual health point is: " + healthPoint);
    }


    public static void deleteAdditionalFacility(char[] life, int dogIndex, char iconHeal, char iconBomb) {
        char iconByDefault = '_';
        if (life[dogIndex + 1] == iconHeal || life[dogIndex + 1] == iconBomb) {
            life[dogIndex + 1] = iconByDefault;
        }
    }

    public static void addAdditionalFacility(int rdmArrayElementFacility, char[] life, char icon) {
        life[rdmArrayElementFacility] = icon;
    }

    public static int moveForward(char[] life, int dogIndex) {
        char temp = life[dogIndex + 1];
        life[dogIndex + 1] = life[dogIndex];
        life[dogIndex] = temp;
        dogIndex++;
        return dogIndex;
    }

    public static int moveBackward(char[] life, int dogIndex) {
        if (dogIndex == 0) {
            System.out.println("You are not able to go backward on the start");
            return dogIndex;
        }
        char temp = life[dogIndex - 1];
        life[dogIndex - 1] = life[dogIndex];
        life[dogIndex] = temp;
        dogIndex--;
        return dogIndex;
    }

}

