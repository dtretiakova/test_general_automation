package arrays;

public class Test {


    public static void main(String[] args) {
        System.out.println(new Test());

        Byte b;
        int a = 10;
        Integer aa = a;
        System.out.println(aa);

        Double dd = Double.valueOf(a);
        //масссив 2 типа
        int[] array = new int [5];
        int[] array2 = {1, 2, 3};
        System.out.println("---------------");

        //цикл массивов
        for(int i = 0; i < array2.length; i++){
            System.out.println(array2 [i]);
        }
        // массив char
        System.out.println("---------------");



        char[] array3 = new char[5];
        char[] array4 = {'A', 'B', 'C'};

        for (int i = 0; i< array3.length; i++){
            array3[i] = (char) ((int) (Math.random() * (123 - 65) + 65)); //min random and max random
            System.out.println(array3[i]);
        }

        int [] arr2 = new int [5];
        int [] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            arr2 [i] = arr1[i];
        }


    }
}
