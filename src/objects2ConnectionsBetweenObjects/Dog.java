package objects2ConnectionsBetweenObjects;

import java.util.Random;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private Owner owner;

    {
        Random random = new Random();
        String [] breeds = {"Akita", "Beagle", "Poodle"};
        breed = breeds[random.nextInt(breeds.length)];
    }

    public Dog(){
        age = 5;
        name = "Sarag";
    }


    public Dog(String name, int age){
        this.age = age;
        this.name = name;
        getInfo();
    }

    public void getInfo() {
        System.out.println("Name: " + name + "; Age: " + age + "; Breed: " + breed
                          + "; Owner: " + ((owner == null) ? "homeless" : owner.getName()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Barsik";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }
}
