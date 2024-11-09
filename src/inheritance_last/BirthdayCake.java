package inheritance_last;

public class BirthdayCake extends Cake{
private String candles;


    public BirthdayCake() {
        super("vanilla");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
