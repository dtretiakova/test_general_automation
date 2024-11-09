package objects;

import java.util.Scanner;

public class LampMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp lamp = new Lamp();

        lamp.printInfo();
      /*  while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                lamp.setBrightness(scanner.nextInt());
                lamp.printInfo();
            } else {
                System.out.println("Yon can enter only integer numbers");
                scanner.next();
            }
        }

       */

        lamp.doSomething();
        lamp.doSomething(5.0);
        lamp.doSomething(5);
        lamp.doSomething(8.35, 5);
        lamp.doSomething(5, 3.33);

        //lamp.doSomethingElse(new int[] {2, 5, 10, -112});
        lamp.doSomethingElse(1, 2, 3);

       int a =  lamp.getA();
        System.out.println(a);
    }


}
