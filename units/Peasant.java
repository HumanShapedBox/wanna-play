package IWantToPlayAGame.units;

import java.util.Random;

import IWantToPlayAGame.methods.Position;

public abstract class Peasant extends BaseHero {

    int arrow, food;
    boolean berserk;

    public Peasant(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
    int[] distance, int arrow, int food, boolean berserk) {
        super(hp, name, position, x, y, attack, defeat, damage, accuracy, distance);

        this.arrow = arrow;
        this.food = food;
        this.berserk = berserk;
    }

}
