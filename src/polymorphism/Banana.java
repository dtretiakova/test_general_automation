package polymorphism;

public class Banana extends Fruit{

    public Banana() {
        setCalories(34);
    }

    public void takeOffPeel(){
        System.out.println("Banana peel removed!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is my favourite!");
    }
}
