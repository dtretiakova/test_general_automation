package pokemonUnite;

public class Pokemon {
    private int health;
    private int attackPower;
    private int defensePower;
    private String name;
    private final int superPokemonRate = 65;
    private final int attackStep = 10;
    private final int defenderStep = 7;

    public int attack(int attackerAttackPower, int defenderDefensePower){
       int damage = attackerAttackPower - (defenderDefensePower/2);
       attackerAttackPower = attackerAttackPower - 10;
       defenderDefensePower = defenderDefensePower - 7;
       return damage;
    }

    public void takeDamage(int damage){
       health = health - damage;
       if (health <= 0){
           health = 0;
       }
    }

  /*  public int defense(int attackerAttackPower, int attackerHealth){
        if (attackerAttackPower > superPokemonRate){


        }

    }

   */


    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public String getName() {
        return name;
    }
}
