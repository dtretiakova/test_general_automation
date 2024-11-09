package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Task1
// Массив char 10x10 елементов, заполнен нижними подчеркиваниями,
// На первой позиции стоит символ @,
// При вводе через сканнер клавишу D - собачка должна сдвинуться вправо на одну ячейку,
// При вводе клавишу A - влево на одну ячейку, W - вверх на ячейку, S - вниз на ячейку.
// Game over когда собачка дошла до конца массива.
//У собаки есть 100 единиц здоровья,
//За каждий шаг она теряет 5 единиц,
//Game over - когда здоровье меньше 0.
//На поле рандомно появляется бомбочка(-) и аптечка(+) = -40 xp/+40xp
//Генерируется один раз
//Каждий ход виводим xp собаки, и как виглядит путь.

public class DogGameMultidimensionalArraysSwitch {
    public static void main(String[] args) {
        char[][] gameArea = new char[10][10];
        int healthPoint = 100;
        int dogIndex = 0;
        int dogIndex2 = 0;
        // получение хода от юзера
        System.out.println("Rules of game: use button W - for to move up, button S - for moving down, " +
                "button D - to move to the right, button A - for moving to the left");
        Scanner scanner = new Scanner(System.in);

        //перші цикли для заповнення масивів
        for (int i = 0; i < gameArea.length; i++) {
            for (int j = 0; j < gameArea[i].length; j++) {
                gameArea[i][j] = '_';
            }
        }
        gameArea[0][0] = '@';

        //рандомизация єлемента для бомби или аптечки
        randomAddingAdditionalFacility(gameArea);

        //запуск цикла ходов собаки
        //gameArea[gameArea.length - 1][gameArea[gameArea.length -1].length -1] обращение к последнему елементу массива

        while (healthPoint > 0 && gameArea[gameArea.length - 1][gameArea[gameArea.length - 1].length - 1] != '@') {
            String move = scanner.next();
            if (!move.equalsIgnoreCase("D") && !move.equalsIgnoreCase("A") &&
                    !move.equalsIgnoreCase("W") && !move.equalsIgnoreCase("S")) {
                System.out.println("You must use only buttons D or A or W or S.");
                continue;
            }
            healthPoint = healthPoint + movingDog(gameArea, dogIndex, dogIndex2, move);
            System.out.println("Your actual health point is: " + healthPoint);

            //реализация ходов собаки
//            movingDog(gameArea, dogIndex, dogIndex2, move, healthPoint);

            //вивод результата поле с ходом
            getResultOfGameArea(gameArea);

            if (move.equalsIgnoreCase("D")) {
                dogIndex2++;
            } else if (move.equalsIgnoreCase("A")) {
                dogIndex2--;
            } else if (move.equalsIgnoreCase("W")) {
                dogIndex--;
            } else if (move.equalsIgnoreCase("S")) {
                dogIndex++;
            }
        }
        if (healthPoint <= 0) {
            System.out.println("Ohh no, game over!");
        } else {
            System.out.println("You win this game! Congrats!!");
        }
    }


    public static int movingDog(char[][] gameArea, int dogIndex, int dogIndex2, String move) {
        char iconHeal = '+';
        char iconBomb = '*';
        char iconByDefault = '_';
        int heal = 40;
        int bomb = -40;
        int healthPointStep = 5;
        int health = 0;
        switch (move.toUpperCase()) {
            case "W": {
                if (dogIndex == 0) {
                    System.out.println("Sorry, you are not able to move up");
                    break;
                } else {
                    if (gameArea[dogIndex - 1][dogIndex2] == iconBomb) {
                        health = bomb;
                        System.out.println("Ohh no! You get in trouble");
                    } else if (gameArea[dogIndex - 1][dogIndex2] == iconHeal) {
                        health = heal;
                        System.out.println("You healed successfully");
                    }
                    if (gameArea[dogIndex - 1][dogIndex2] == iconHeal || gameArea[dogIndex - 1][dogIndex2] == iconBomb) {
                        gameArea[dogIndex - 1][dogIndex2] = iconByDefault;
                    }
                    char temp = gameArea[dogIndex][dogIndex2];
                    gameArea[dogIndex][dogIndex2] = gameArea[dogIndex - 1][dogIndex2];
                    gameArea[dogIndex - 1][dogIndex2] = temp;
                    break;
                }
            }
            case "S": {
                if (dogIndex == gameArea.length - 1) {
                    System.out.println("Sorry, you are not able to move down");
                    break;
                } else {
                    if (gameArea[dogIndex + 1][dogIndex2] == iconBomb) {
                        health = bomb;
                        System.out.println("Ohh no! You get in trouble");
                    } else if (gameArea[dogIndex + 1][dogIndex2] == iconHeal) {
                        health = heal;
                        System.out.println("You healed successfully");
                    }
                    if (gameArea[dogIndex + 1][dogIndex2] == iconHeal || gameArea[dogIndex + 1][dogIndex2] == iconBomb) {
                        gameArea[dogIndex + 1][dogIndex2] = iconByDefault;
                    }
                    char temp = gameArea[dogIndex][dogIndex2];
                    gameArea[dogIndex][dogIndex2] = gameArea[dogIndex + 1][dogIndex2];
                    gameArea[dogIndex + 1][dogIndex2] = temp;
                    break;
                }
            }
            case "A": {
                if (dogIndex2 == 0) {
                    System.out.println("Sorry, you are not able to move left");
                    break;
                } else {
                    if (gameArea[dogIndex][dogIndex2 - 1] == iconBomb) {
                        health = bomb;
                        System.out.println("Ohh no! You get in trouble");
                    } else if (gameArea[dogIndex][dogIndex2 - 1] == iconHeal) {
                        health = heal;
                        System.out.println("You healed successfully");
                    }
                    if (gameArea[dogIndex][dogIndex2 - 1] == iconHeal || gameArea[dogIndex][dogIndex2 - 1] == iconBomb) {
                        gameArea[dogIndex][dogIndex2 - 1] = iconByDefault;
                    }
                    char temp = gameArea[dogIndex][dogIndex2];
                    gameArea[dogIndex][dogIndex2] = gameArea[dogIndex][dogIndex2 - 1];
                    gameArea[dogIndex][dogIndex2 - 1] = temp;
                    break;
                }
            }
            case "D": {
                if (dogIndex2 == gameArea[dogIndex].length - 1) {
                    System.out.println("Sorry, you are not able to move right");
                    break;
                } else {
                    if (gameArea[dogIndex][dogIndex2 + 1] == iconBomb) {
                        health = bomb;
                        System.out.println("Ohh no! You get in trouble");
                    } else if (gameArea[dogIndex][dogIndex2 + 1] == iconHeal) {
                        health = heal;
                        System.out.println("You healed successfully");
                    }
                    if (gameArea[dogIndex][dogIndex2 + 1] == iconHeal || gameArea[dogIndex][dogIndex2 + 1] == iconBomb) {
                        gameArea[dogIndex][dogIndex2 + 1] = iconByDefault;
                    }
                    char temp = gameArea[dogIndex][dogIndex2];
                    gameArea[dogIndex][dogIndex2] = gameArea[dogIndex][dogIndex2 + 1];
                    gameArea[dogIndex][dogIndex2 + 1] = temp;
                    break;
                }
            }
        }
        //підрахунок суми за хід

        health = health - healthPointStep;
        return health;
    }


    public static void randomAddingAdditionalFacility(char[][] gameArea) {
        Random random = new Random();
        char iconHeal = '+';
        char iconBomb = '*';

        for (int i = 0; i < gameArea.length; i++) {
            int rdmArrayElementHeal = random.nextInt(1, gameArea.length);
            int rdmArrayElementBomb = random.nextInt(1, gameArea.length);
            while (rdmArrayElementHeal == rdmArrayElementBomb) {
                rdmArrayElementBomb = random.nextInt(1, gameArea.length - 1);
            }
            for (int j = 0; j < gameArea[i].length; j++) {
                gameArea[i][rdmArrayElementHeal] = iconHeal;
                gameArea[i][rdmArrayElementBomb] = iconBomb;
            }
        }
    }

    public static void getResultOfGameArea(char[][] gameArea) {
        for (int i = 0; i < gameArea.length; i++) {
            System.out.println(Arrays.toString(gameArea[i]));
        }
    }
}


