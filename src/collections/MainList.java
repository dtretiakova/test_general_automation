package collections;

import interfaces.CrystalMaiden;
import interfaces.Hero;
import interfaces.Pudge;
import interfaces.Sniper;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {
    public static void main(String[] args) {
        ArrayList<Hero> al = new ArrayList<>();

        al.add(new Pudge("Pudge", 34));
        al.add(new CrystalMaiden("Crystal", 23));
        al.add(new Sniper("Sniper", 18));

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getUltimate());
        }
        CrystalMaiden crystalMaiden = new CrystalMaiden("Crystal", 23);
        al.add(crystalMaiden);
        System.out.println(al.contains(crystalMaiden));

        System.out.println(al.lastIndexOf(crystalMaiden));
        al.remove(crystalMaiden);
        al.remove(crystalMaiden);
        System.out.println(al.size());

        LinkedList<Hero> ll = new LinkedList<>();
        ll.addAll(al);
        System.out.println(ll);



    }
}
