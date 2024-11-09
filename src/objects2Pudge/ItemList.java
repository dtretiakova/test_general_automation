package objects2Pudge;

import java.util.Random;

public class ItemList {
    private Item[] itemsKit = new Item[5];

    public ItemList() {
        itemsKit = createItemList();
    }

    private Item[] createItemList(){
        Item hammer = new Item(54, 29, 20, "Hammer");
        Item stick = new Item(76, 13, 22, "Stick");
        Item sledgehammer = new Item(87, 17, 35, "Sledgehammer");
        Item bat = new Item(69, 23, 32, "Bat");
        Item hatchet = new Item(71, 14, 38, "Hatchet");
        itemsKit[0] = hammer;
        itemsKit[1] = stick;
        itemsKit[2] = sledgehammer;
        itemsKit[3] = bat;
        itemsKit[4] = hatchet;
        return itemsKit;
    }


    public Item getRandomItemKit() {
        Random random = new Random();
        int randomNumberItem = random.nextInt(-1, itemsKit.length);
        if (randomNumberItem == -1){
            return null;
        }
        return itemsKit[randomNumberItem];
    }
}
