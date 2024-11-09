package objects2Pudge;

public class MainPudge {
    public static void main(String[] args) throws InterruptedException {
        Pudge pudge1 = new Pudge(1000, 10, 12, 88);
        Pudge pudge2 = new Pudge(1000, 31, 8, 57);

        pudge1.addItem();
        pudge2.addItem();

        System.out.println("PUDGE_1: ");
        pudge1.getInfo();
        System.out.println("PUDGE_2: ");
        pudge2.getInfo();

        while (pudge1.getHealth() > 0 && pudge2.getHealth() > 0) {
            Thread.sleep(1000);
            pudge1.setHealth(pudge1.getHealth() - pudge2.getStrikePower());
            if (pudge1.getHealth() <= 0) {
                break;
            }
            pudge2.setHealth(pudge2.getHealth() - pudge1.getStrikePower());
            pudge1.randomRemoveItem();
            pudge2.randomRemoveItem();

            System.out.println("PUDGE_1: ");
            pudge1.getInfo();
            System.out.println("PUDGE_2: ");
            pudge2.getInfo();
        }
        System.out.println("--------------------");
        if (pudge1.getHealth() > pudge2.getHealth()) {
            System.out.println("Pudge1 won!");
        } else {
            System.out.println("Pudge2 won!");
        }

    }
}
