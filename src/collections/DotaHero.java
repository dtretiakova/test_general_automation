package collections;

import java.util.Objects;

public class DotaHero {
    private String name;
    private int level;

    public DotaHero(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "DotaHero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DotaHero dotaHero = (DotaHero) o;
        return level == dotaHero.level && Objects.equals(name, dotaHero.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + level;
        return result;
    }
}
