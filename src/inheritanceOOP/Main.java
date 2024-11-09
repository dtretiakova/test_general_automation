package inheritanceOOP;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Smartphone smartphone = new Smartphone(5.3, "Galaxy");
        //  Iphone iphone = new Iphone(15.6, "Plus");

        //smartphone.getInfo();
        //iphone.getInfo();

        //  Smartphone smartphone2 = new Iphone(15.6, "Plus");
        Smartphone smartphone3 = new Honor(5.4, "X", "Android");

       /* smartphone2.getInfo();
        System.out.println();
        smartphone3.getInfo();

        System.out.println(iphone.equals(null));

        */

        // Object object = smartphone3 ;
        // System.out.println(object.toString());
        Smartphone object2 = (Smartphone) smartphone.clone();
        System.out.println(object2.toString());
        smartphone.model = "Iphone";
        System.out.println(smartphone);
        System.out.println(object2);


    }


}
