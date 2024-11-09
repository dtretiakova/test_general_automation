package interfaces;

import collections.DotaHero;

public class Pudge extends DotaHero implements Hero{

    public Pudge(String name, int level) {
        super(name, level);
    }

    @Override
    public String getFirstAbility() {
        return "Meat Hook";
    }

    @Override
    public String getUltimate() {
        return "Reap";
    }
}
