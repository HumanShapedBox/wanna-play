package IWantToPlayAGame.units;

import java.util.Random;

public class Peasant extends BaseHero {
    
    int arrow, food, berserk;

    public Peasant(String name, int x, int y) {
        super(100, name, x, y, 0, new Random(), 
        new int[] {1, 8}, new Random(), new int[] {1, 2});
        arrow = 1;
        food = 5;
        berserk = 5;
    }
}
