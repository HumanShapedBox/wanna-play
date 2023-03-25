package IWantToPlayAGame.units;

import java.util.Random;

public class Infantry extends BaseHero{

    int combo;

    public Infantry(String name, int x, int y) {
        super(100, name, x, y, 10, new Random(), 
        new int[] {1, 8}, new Random(), new int[] {1, 2});
        combo = 0;
    }
}
