package generics;

public class SomeNonGeneric<Object> {
    private Object t;

    public SomeNonGeneric(Object t) {
        this.t = t;
    }

    public Object get() {
        return t;
    }

    public void showType() {
        System.out.println("Object type " + t.getClass());
    }
}



