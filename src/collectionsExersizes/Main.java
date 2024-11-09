package collectionsExersizes;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("CatA", 2);
        Cat cat2 = new Cat("CatB", 7);
        Cat cat3 = new Cat("CatC", 1);

        Dog dog1 = new Dog("A", 3);
        Dog dog2 = new Dog("B", 1);
        Dog dog3 = new Dog("C", 5);

        Map<Cat, Dog> animalsMap = new HashMap<>();
        animalsMap.put(cat1, dog1);
        animalsMap.put(cat2, dog2);
        animalsMap.put(cat3, dog3);

        Cat newCat2 = new Cat("CatB", 7);
        System.out.println(animalsMap.get(newCat2));

    }
}
