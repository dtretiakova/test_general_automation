package objects;

public class DoorMain {
    public static void main(String[] args) {
        Door door = new Door();
        door.printInfo();

        door.openDoor();
        door.printInfo();

        door.closeDoor();
        door.printInfo();
    }
}
