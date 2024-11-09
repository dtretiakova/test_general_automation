package objectsInnerNestedClasses;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName(){
        System.out.println("Dog's name: " + name);
    }
}



