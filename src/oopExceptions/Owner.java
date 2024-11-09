package oopExceptions;

public class Owner implements Cloneable {
    private String name;

    public Owner(Owner owner){
        this.name = owner.name;
    }

    public Owner(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
