package examplesTasksWithStringMethods;

import java.util.Scanner;

public class StringLength_1 {
    //Со сканнера вводится две строки
    //Определить:
    //1.Какая строка длиннее
    //2.В какой строке больше слов
    //3.В какой строке больше согласних
    //Слова отделяются пробелами(либо учесть что могут бить точки, запятие)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        //1.Какая строка длиннее
        if (firstInput.length() > secondInput.length()) {
            System.out.println("First sentence is longer than second one.");
        } else if (secondInput.length() > firstInput.length()) {
            System.out.println("Second sentence is longer than first one.");
        } else {
            System.out.println("Two strings are the same length.");
        }

        //2.В какой строке больше слов - method split
        String[] resultFirstSentence = firstInput.split(" ");
        String[] resultSecondSentence = secondInput.split(" ");
        if (resultFirstSentence.length > resultSecondSentence.length){
            System.out.println("First sentence has " + resultFirstSentence.length + " words, it is more then in second sentence.");
        } else if (resultSecondSentence.length > resultFirstSentence.length){
            System.out.println("Second sentence has " + resultSecondSentence.length + " words, it is more then in first sentence.");
        } else {
            System.out.println("Two strings have the same words count " + resultSecondSentence.length);
        }

        int counterFirstInput = calculateConsonantLetters(firstInput);
        int counterSecondInput = calculateConsonantLetters(secondInput);
        System.out.println(counterFirstInput);
        System.out.println(counterSecondInput);

    }
    //3.В какой строке больше согласних
    public static int calculateConsonantLetters(String input){
        String[] letterArray = {"A", "E", "I", "O", "U", "Y"};
        int counter = 0;
        int mainCounterConsonant = 0;
        for (int i = 0; i < input.length(); i++) {
            String letterIndex = String.valueOf(input.charAt(i));
            for (int j = 0; j < letterArray.length; j++) {
              if (!letterIndex.equalsIgnoreCase(letterArray[j])){
                counter++;
              }
            }
            if (counter == letterArray.length){
               mainCounterConsonant++;
            }
        }
        return mainCounterConsonant;
    }


}
