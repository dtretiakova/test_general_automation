package oopExceptions;


import java.util.Random;

public class Dog implements Cloneable {
    private String name;
    private int age;
    private String breed;
    private Owner owner;

    /*public Dog(Dog dog) {
        super();
        this.name = dog.name;
        this.age = dog.age;
        this.breed = dog.breed;
        this.owner = new Owner(dog.owner);
    }

     */

    {
        Random random = new Random();
        String[] breeds = {"Akita", "Beagle", "Poodle"};
        breed = breeds[random.nextInt(breeds.length)];
    }

    public Dog() {
        age = 5;
        name = "Sarag";
    }


    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    public void someMethod() throws CloneNotSupportedException {
        clone();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Owner aa = (Owner) owner.clone();
        Dog bbb = (Dog) super.clone();
        bbb.setOwner(aa);
        return bbb;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                '}';
    }
}
