package polymorphism;

public class MarketMain {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        apple2.removeSeeds();

        Banana banana = new Banana();
        banana.takeOffPeel();

        Fruit banana2 = new Banana();
        ((Banana) banana2).takeOffPeel();

        Fruit orange = new Fruit();

        squeeze(apple);
        squeeze(banana);
        squeeze(banana2);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
