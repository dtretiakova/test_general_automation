package interfaces;

import collections.DotaHero;

public class Sniper extends DotaHero implements Hero{

    public Sniper(String name, int level) {
        super(name, level);
    }

    @Override
    public String getFirstAbility() {
        return "Shrapnel";
    }

    @Override
    public String getUltimate() {
        return "Head Shot";
    }
}
