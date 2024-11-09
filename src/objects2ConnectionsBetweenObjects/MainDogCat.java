package objects2ConnectionsBetweenObjects;

public class MainDogCat {
    public static void main(String[] args) {
        Dog dog = new Dog();
       /* String name = dog.getName();
        System.out.println(name);

        Cat cat = new Cat();
        cat.setName(dog.getName());
        */
      dog.getInfo();

      Dog dog2 = new Dog("Anak", 10);

      Owner owner = new Owner("Denis");
        dog2.setOwner(owner);
        dog2.getInfo();




    }
}
