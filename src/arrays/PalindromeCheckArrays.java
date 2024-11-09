package arrays;

//Есть массив char, проверить является ли слово в массиве палиндромом.


public class PalindromeCheckArrays {
    public static void main(String[] args) {
        // System.out.println("Please enter the word: ");
        // Scanner scanner = new Scanner(System.in);
        // String word = scanner.next();
        String full = "";

        char[] arrayWord = new char[]{'D', 'E', 'D', 'T'};
//        for (int i = 0; i < arrayWord.length; i++) {
//           full = full.concat(String.valueOf(arrayWord[i]));
//        }
//
//        String finish = "";
//       for (int i = full.length() - 1; i >= 0; i--){
//           finish = finish.concat(String.valueOf(full.charAt(i)));
//
//        }
//       if (finish.equals(full)){
//           System.out.println(finish + "is palindrome");
//       } else {
//           System.out.println("Your word is not palindrome");
//
//       }

        boolean isPalindrome = true;
        for (int i = 0; i < arrayWord.length / 2; i++) {
            char firstLetter = arrayWord[i];
            char lastLetter = arrayWord[arrayWord.length - i - 1];

            if (firstLetter != lastLetter) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }


    }
}
