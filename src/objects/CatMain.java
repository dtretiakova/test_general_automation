package objects;

public class CatMain {
    public static void main(String[] args) {
        CatBox cb;
        cb = new CatBox();
        System.out.println(cb);
       cb.printBox();

        cb.length = 5;
        cb.height = 5;
        cb.width = 5;
        cb.printBox();


        CatBox bigBox = new CatBox();
        bigBox.setLength(100);
        bigBox.printBox();

    }
}
