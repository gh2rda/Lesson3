package ru.rzn.sbt.javaschool.lesson3.army;

import java.util.Objects;

/**
 * Воин
 */
final public class Warrior {
    /**
     * Оружие
     */
    private Weapon weapon;

    /**
     * Сила
     */
    private final int strength;

    public Warrior(int strength) {
        this(null, strength);
    }

    public Warrior(Weapon weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Warrior other = (Warrior) obj;
        if (this.strength == other.strength) {
            if ((this.weapon == null && other.weapon == null)||(this.weapon.equals(other.weapon))) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, weapon);
    }
}
