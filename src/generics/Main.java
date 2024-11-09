package generics;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        SomeGeneric<String> someGeneric = new SomeGeneric<>("s");
        someGeneric.showType();

        SomeNonGeneric someNonGeneric = new SomeNonGeneric(dog);
        someNonGeneric.showType();

        String gen = someGeneric.get();
        String nonGen = (String) someNonGeneric.get();
        System.out.println(gen);
        System.out.println(nonGen);



    }
}
