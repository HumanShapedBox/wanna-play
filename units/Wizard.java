package IWantToPlayAGame.units;

import java.util.Random;

public abstract class Wizard extends BaseHero {
    int magic, maxMagic, trick, heal, power;

    public Wizard(float hp, String name, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int[] distance, int magic, int maxMagic, int trick, int heal, int power) {

        super(hp, name, x, y, attack, defeat, damage, accuracy, distance);
        this.magic = magic;
        this.maxMagic = maxMagic;
        this.trick = trick;
        this.heal = heal;
        this.power = power;
    }
}
