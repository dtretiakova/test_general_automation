package systemOutPrintf;

import java.util.Arrays;

public class lesson7Printf_StringBuilder {
    public static void main(String[] args) {
        /*System.out.printf("  %10s %s %05d\n", "Text!","Second text!", 99);
        //5.2f - 5 символов всего + из них 2 десятичних
        System.out.printf("%5.2f\n", Math.PI);


        System.out.printf("|%-1s|%-15s|%-7s|\n", "№","Currency","Rate");
        System.out.printf("|%-1s|%-15s|%-7s|\n", "1","American dollar","27.4");
        System.out.printf("|%-1s|%-15s|%-7s|\n", "2","Euro","32.7");

        System.out.printf("%tT\n", new Date());
        Date day = new Date();
        System.out.printf("Today is %1$ta weekday, %1$tY year, %1$tB month, %1$td day, time: %1$tH hours, %1$tM minutes, %1$tS seconds", day);
         */

        String str = "";
        for (int i = 0; i < 100; i++) {
            str = str + i;
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        System.out.println("L" + sb.length());
        System.out.println("C" + sb.capacity());

        sb.append("123");
        System.out.println("L" + sb.length());
        System.out.println("C" + sb.capacity());

        sb = new StringBuilder();
        int oldCapacity = sb.capacity();
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            sb.append(i);
            int capacity = sb.capacity();
            if (oldCapacity != capacity) {
                oldCapacity = capacity;
                System.out.println("New capacity is: " + oldCapacity);
                System.out.println("Counter " + ++counter);

            }
            sb.trimToSize();
        }
        System.out.println("L" + sb.length());
        System.out.println("C" + sb.capacity());

        StringBuilder sb2 = new StringBuilder("123456");
        System.out.println("sb2: " + sb2.toString());
        sb2.append("123", 0, 1);
        //sb2append (str, offset, len)
        sb2.insert(3, "000", 0,3);

        System.out.println("sb2: " + sb2);


        String words = "new word practice";
        String[] arrSpl = words.split(" ");
        System.out.println(Arrays.toString(arrSpl));

    }

}
