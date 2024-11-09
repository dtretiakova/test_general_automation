package objectsInnerNestedClasses;

public class Car {
    private static String color;
    private static String mark = "Audi";

    public void getInfo(){
        System.out.println("Color: " + color + ";"
                            + " Mark: " + mark + ";");
    }

    public void setColor(String color){
        this.color = color;
    }

    public static String getMark(){
        return mark;
    }

}
