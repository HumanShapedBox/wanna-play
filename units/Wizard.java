package IWantToPlayAGame.units;

import java.util.Random;

import IWantToPlayAGame.methods.Position;

public abstract class Wizard extends BaseHero {
    int magic, maxMagic, trick, heal, power;

    public Wizard(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int speed, int magic, int maxMagic, int trick, int heal, int power) {

        super(hp, name, position, x, y, attack, defeat, damage, accuracy, speed);
        this.magic = magic;
        this.maxMagic = maxMagic;
        this.trick = trick;
        this.heal = heal;
        this.power = power;
    }
}
