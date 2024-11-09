package objects;

public class CatBox {
    int length = 3;
    int height = 3;
    int width = 3;

    public void printBox(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public void setLength(int l){
        length = l;
    }
}


