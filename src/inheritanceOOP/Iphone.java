package inheritanceOOP;

import java.util.Objects;

public class Iphone extends Smartphone {
    private boolean hasGps;

    public Iphone(double screenSize, String model) {
        super(screenSize, model);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Has GPS: " + hasGps);
    }

   /* @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }

        Iphone otherIphone = (Iphone) obj;
        return hasGps == otherIphone.hasGps &&
                screenSize == otherIphone.screenSize &&
                model.equals(otherIphone.model);
    }

    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        return hasGps == iphone.hasGps;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(hasGps);
    }
}
