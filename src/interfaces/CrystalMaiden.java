package interfaces;

import collections.DotaHero;

public class CrystalMaiden extends DotaHero implements Hero{

    public CrystalMaiden(String name, int level) {
        super(name, level);
    }

    @Override
    public String getFirstAbility() {
        return "Frost bite";
    }

    @Override
    public String getUltimate() {
        return "New Year";
    }


}
