package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class String_arrays {
    public static void main(String[] args) {
        //Массив типа String 3х3
        //Заполняется через сканер через ввод 3 строк - пример 3 ФИО
        //3 єлемента каждого из массивов массива - фамилия, имя, отчество
        //Программа спрашивает поисковий запрос(например: вводим имя - в результате нужно вивести все
        //совпадения, целиком ФИО.

        String[][] fullName = new String[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name, second name, father name: ");
        for (int i = 0; i < fullName.length; i++) {
            String nameFIO = scanner.nextLine();

            int indexSecondName = nameFIO.indexOf(" ");
            String secondName = nameFIO.substring(0, indexSecondName).trim();
            secondName = secondName.substring(0, 1).toUpperCase() + secondName.substring(1);

            int indexFirstName = nameFIO.lastIndexOf(" ");
            String firstName = nameFIO.substring(indexSecondName, indexFirstName).trim();
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

            String fatherName = nameFIO.substring(indexFirstName).trim();
            fatherName = fatherName.substring(0, 1).toUpperCase() + fatherName.substring(1);

            fullName[i][0] = secondName;
            fullName[i][1] = firstName;
            fullName[i][2] = fatherName;
        }

        while (true) {
            boolean isFound = false;
            String exit = "/";
            System.out.println("Please enter for searching: ");
            System.out.println("For exit press button - '/' ");
            String search = scanner.nextLine();
            if (search.equalsIgnoreCase(exit)) {
                return;
            }
            for (int i = 0; i < fullName.length; i++) {
                for (int j = 0; j < fullName[i].length; j++) {
                    if (fullName[i][j].trim().toUpperCase().contains(search.toUpperCase())) {
                        System.out.println(Arrays.toString(fullName[i]));
                        isFound = true;
                    } else if (search.length() <= 2) {
                        break;
                    }
                }
            }
            if (isFound == false) {
                System.out.println("We couldn't find something by your searching request");
            }
        }
    }
}








