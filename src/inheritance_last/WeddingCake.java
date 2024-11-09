package inheritance_last;

public class WeddingCake extends Cake{
private int tiers;

    public WeddingCake() {
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
