package objectsInnerNestedClasses;

public class ElectricGuitar {
    private String sound;

    public ElectricGuitar(String sound) {
        this.sound = sound;
        new Amplifier();
    }

    public void play() {
        System.out.println("Sound: " + sound);
    }

    class Amplifier {
        public Amplifier() {
            toUpperCase();
        }

        public void toUpperCase() {
            sound = sound.toUpperCase();
        }

    }

}
