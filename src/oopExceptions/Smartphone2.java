package oopExceptions;

public class Smartphone2 implements Cloneable {
    protected double screenSize;
    public String model;


    //  public Smartphone() {
    // }

    public Smartphone2(double screenSize, String model) {
        this.screenSize = screenSize;
        this.model = model;
    }

    public void getInfo() {
        System.out.print("Model: " + model + "; Screen size : " + screenSize + ";");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smartphone2 that = (Smartphone2) o;
        return Double.compare(screenSize, that.screenSize) == 0 && model.equals(that.model);
    }

 /*   @Override
    public int hashCode() {
        int result = Double.hashCode(screenSize);
        result = 31 * result + model.hashCode();
        return result;
    }

  */

   @Override
    public String toString() {
        return "Smartphone{" +
                "screenSize=" + screenSize +
                ", model='" + model + '\'' +
                '}';
    }





    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


