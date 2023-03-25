package IWantToPlayAGame.units;

import java.util.Random;

public class Sniper extends BaseHero{
    int arrows;
    int poisonedArrow;

    public Sniper(String name, int x, int y) {
        super(100, name, x, y, 15, new Random(), 
        new int[] {1, 8}, new Random(), new int[] {3, 4, 5});
        arrows = 10;
        poisonedArrow = 0;
    }
    
}
