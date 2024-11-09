package interfaces;

public class Dota2Engine {
    private Hero hero1;
    private Hero hero2;

    public Dota2Engine(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
    }

    public void printFirstAbility() {
        System.out.println("H1: " + hero1.getFirstAbility() + "; H2: " + hero2.getFirstAbility());
    }

    public void firstHeroUltimate() {
        System.out.println(hero1.getUltimate());
    }
}
