package IWantToPlayAGame.units;

import java.util.Random;

public class Knight extends Warrior{

    public Knight(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 3, 4, 5 }, 0);

    }
    
}
