package objects;

import java.util.Arrays;

public class Lamp {
    boolean state;
    private int brightness;

   public void setBrightness(int brightness) {
        this.brightness = brightness;
        if (brightness == 0) {
            state = false;
        } else{
            state = true;
        }
    }

    public void printInfo() {
        System.out.println("Light: " + (state ? "ON" : "OFF")
                + "; Brightness: " + brightness);
    }
//перегруженние метод/ overloadingMethods
    public void doSomething(){
        System.out.println("default");
    }

    public void doSomething(int i){
        System.out.println("int");
    }

    public void doSomething(double i){
        System.out.println("double");
    }

    public void doSomething(double i, int y){
        System.out.println("double-int");
    }

    public void doSomething(int y, double i){
        System.out.println("int-double");
    }

   // Аргумент переменной длини
    public void doSomethingElse(int ...varg){
        for (int i = 0; i < varg.length; i++) {
            System.out.println("varg[" + i + "]=" + varg[i]);
        }
   }

   public void doSomethingElse(int[] arr, int a){
   }

   public int getA(){
      int number = 10;
       return number;
   }

}
