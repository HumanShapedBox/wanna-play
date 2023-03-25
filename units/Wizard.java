package IWantToPlayAGame.units;

import java.util.Random;

public class Wizard extends BaseHero {
    int magic, maxMagic, trick, heal, power;

    public Wizard(String name, int x, int y) {
        super(100, name, x, y, 20, new Random(), 
        new int[] {1, 8}, new Random(), new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        magic = 100;
        maxMagic = 100;
        trick = 1;
        heal = 10;
        power = 5;
    }
}
