package inheritanceOOP;

public class Smartphone implements Cloneable {
    protected double screenSize;
    protected String model;

    //  public Smartphone() {
    // }

    public Smartphone(double screenSize, String model) {
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

        Smartphone that = (Smartphone) o;
        return Double.compare(screenSize, that.screenSize) == 0 && model.equals(that.model);
    }

 /*   @Override
    public int hashCode() {
        int result = Double.hashCode(screenSize);
        result = 31 * result + model.hashCode();
        return result;
    }

  */

   /* @Override
    public String toString() {
        return "Smartphone{" +
                "screenSize=" + screenSize +
                ", model='" + model + '\'' +
                '}';
    }

    */



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


