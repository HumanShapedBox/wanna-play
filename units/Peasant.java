package IWantToPlayAGame.units;

import java.util.Random;

public abstract class Peasant extends BaseHero {

    int arrow, food;
    boolean berserk;

    public Peasant(float hp, String name, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
    int[] distance, int arrow, int food, boolean berserk) {
        super(hp, name, x, y, attack, defeat, damage, accuracy, distance);

        this.arrow = arrow;
        this.food = food;
        this.berserk = berserk;
    }

}
