package objects;

public class Door {
    boolean isOpened;
    String material = "wooden";
    String color = "black";

    public void printInfo() {
        System.out.println("State:" + ((isOpened) ? "opened" : "closed") + ";"
                + " Material:" + material + ";" + " Color:" + color + ";");
    }

    public void openDoor() {
        isOpened = true;
    }

    public void closeDoor() {
        isOpened = false;
    }

}
