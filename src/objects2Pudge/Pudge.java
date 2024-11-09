package objects2Pudge;
/*Если у Player больше items = сила удара будеть мощнее.
Pudge - игрок, item - предмет в сумке игрока;
2 героя, у кого-то есть предмет у кого-то нету, бьют по очереди, проиграл тот у кого здоровье ниже 0.
Бьют используя силу удара.
Отображать индикатор здоровья.
Пример: есть pudge1 и pudge2 = pudge2 делает удар, у pudge1 отнимается от здоровья величина удара pudge2(strikepower)
и наоброт.
И так по очереди - до конца пока у кого-то не закончится здоровье 0 или ниже.
Print кто победил fight.
 */

import java.util.Random;

public class Pudge {
    private int health;
    private int ability;
    private int intelligence;
    private int strength;
    private int strikePower;
    private ItemList itemList;
    Item[] bag = new Item[2];

    public Pudge(int health, int ability, int intelligence, int strength) {
        this.health = health;
        this.ability = ability;
        this.intelligence = intelligence;
        this.strength = strength;
        computeStrikePower();
        this.itemList = new ItemList();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getStrikePower() {
        return strikePower;
    }

    public void addItem() {
        for (int i = 0; i < bag.length; i++) {
            Item randomItem = itemList.getRandomItemKit();

            if (bag[i] == null) {
                if (randomItem != null) {
                    bag[i] = randomItem;
                } else {
                  continue;
                }
            }
            ability += randomItem.getAbility();
            intelligence += randomItem.getIntelligence();
            strength += randomItem.getStrength();
            computeStrikePower();
        }
    }


    public void randomRemoveItem() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 20){
            for (int i = 0; i < bag.length; i++) {
                if (bag[i] != null) {
                    ability -= bag[i].getAbility();
                    intelligence -= bag[i].getIntelligence();
                    strength -= bag[i].getStrength();
                    computeStrikePower();
                    bag[i] = null;
                    break;
                }
            }
        }

    }


    public void computeStrikePower() {
        strikePower = ability / 2 + intelligence / 3 + strength;
    }

    public void getInfo() {
        System.out.println("Health: " + health
                + "; Ability: " + ability
                + "; Intelligence: " + intelligence
                + "; Strength: " + strength
                + "; Strike Power: " + strikePower + ";");



        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null) {
                System.out.println("Item №" + i + ": " + bag[i].getName());
            } else if (bag[i] == null) {
                System.out.println("Item №" + i + ": empty");
            }
        }
    }
}
