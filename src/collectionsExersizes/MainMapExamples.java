package collectionsExersizes;

import java.util.*;

public class MainMapExamples {
    public static void main(String[] args) {
        Dog dog1 = new Dog("A", 3);
        Dog dog2 = new Dog("B", 1);
        Dog dog3 = new Dog("C", 5);

        TreeSet<Dog> dogs = new TreeSet<>(new DogComparator());
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs);
        Iterator<Dog> iter = dogs.iterator();
        while (iter.hasNext()) {
            Dog dog = iter.next();
            if (dog.getAge() % 3 == 0) {
                iter.remove();
            }



        /*for (Dog dog : dogs){
           if (dog.getAge() % 3 == 0){
                //dogs.remove(dog);
            }
           dog.setName(dog.getName() + 1);
            System.out.println(dog);

         */
        }
        System.out.println(dogs);

        System.out.println("-----------------------------");

        Map<String, Dog> dogMap = new HashMap<>();
        dogMap.put("one", dog1);
        dogMap.put("two", dog2);
        dogMap.put("three", dog3);
        System.out.println(dogMap);


        //1.Перебор Map циклом через ключи
        Set<String> keySet = dogMap.keySet();
        for (String key : keySet) {
            System.out.println(key + "=" + dogMap.get(key));
        }

        //2.Перебор Map через EntrySet
        dogMap.entrySet();
        for (Map.Entry<String, Dog> dogEntry : dogMap.entrySet()){
            System.out.println(dogEntry.getKey() + "=" + dogEntry.getValue());
        }


       //3.Перебор Map с помощью итератора
        Iterator<String> iter2 = dogMap.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(dogMap.get(iter2.next()));
        }


    }
}
