package oopExceptions;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

       Smartphone2 smartphone = new Smartphone2(12.2, "Duos");
        Smartphone2 smartphone1Clone = (Smartphone2) smartphone.clone();
        System.out.println(smartphone.toString());
        System.out.println(smartphone1Clone.toString());

        smartphone.model = "Duos deluxe";
        System.out.println(smartphone.toString());
        System.out.println(smartphone1Clone.toString());



       Owner a = new Owner("Darigos");
        Dog b = new Dog();
        b.setOwner(a);
        System.out.println(b.toString());

        Dog bb = (Dog) b.clone();
        //System.out.println(dogClone.toString());
       // System.out.println(dog.toString());

        a.setName("Stenis");
        System.out.println(bb.toString());
        System.out.println(b.toString());









    }
}
