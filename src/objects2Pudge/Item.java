package objects2Pudge;

public class Item {
    private int strength;
    private int ability;
    private int intelligence;
    private String name;

    public Item(int strength, int ability, int intelligence, String name) {
        this.strength = strength;
        this.ability = ability;
        this.intelligence = intelligence;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAbility() {
        return ability;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
