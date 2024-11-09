package collectionsExersizes;

public class MainOwnArrList {
    public static void main(String[] args) {
       OwnArrayList dogsList = new OwnArrayList();

        Dog dog1 = new Dog("A", 12);
        Dog dog2 = new Dog("B", 5);
        dogsList.add(dog1);
        dogsList.add(dog2);

        System.out.println(dogsList);

        Dog dog3 = new Dog("C", 10);
        Dog dog4 = new Dog("D", 1);
        dogsList.add(dog3);
        dogsList.add(dog4);

        System.out.println(dogsList);

        dogsList.remove(new Dog("C", 10));
        System.out.println(dogsList);
    }
}
