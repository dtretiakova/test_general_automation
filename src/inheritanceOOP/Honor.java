package inheritanceOOP;

public class Honor extends Smartphone{
    private String os = "IOS";

    public Honor(double screenSize, String model, String os) {
        super(screenSize, model);
    }



    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(" OS: " + os);
    }
}
