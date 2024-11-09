package objectsInnerNestedClasses;
//Анонимний класс

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Outer.Inner inner = new Outer("outerPublic").new Inner();
        String str = inner.innerPublic;



        Car car1 = new Car();
        car1.setColor("Black");

        Car car2 = new Car();
        car2.setColor("White");

        car1.getInfo();
        car2.getInfo();

        System.out.println(car1.getMark());

        System.out.println(Outer.Nested.nestedFieldNew);

        */

        /* ElectricGuitar guitar = new ElectricGuitar("tara ri tarara");
        guitar.play();

        Dog dog = new Dog("Doritos");
        dog.printName();

        Dog dog2 = new Dog("Pudge") {
            private int age = 15;

            public void printName() {
                System.out.println("Name: " + getName() + "; Age: " + age + ";");
            }
        };
        dog2.printName();

         */


        Eurasia eurasia = new Eurasia() {
            public void print() {
                for (String country : getCountries()) {
                    if (!country.equals("France")) {
                        System.out.println(country);
                    }

                }
            }
        };
        eurasia.print();

//константа
        System.out.println(Arrays.toString(DaysOfWeek.values()));
        System.out.println(DaysOfWeek.valueOf("MONDAY"));
        System.out.println(DaysOfWeek.TUESDAY);
        System.out.println(DaysOfWeek.TUESDAY.getField1());

        DaysOfWeek day = DaysOfWeek.valueOf("MONDAY");
        switch (day){
            case MONDAY -> System.out.println(day.getField1());
        }
    }



}
