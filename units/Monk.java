package IWantToPlayAGame.units;

import java.util.Random;

public class Monk extends Wizard {

    
    public Monk(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 3, 4, 5 }, 100, 100, 
                1, 10, 5);

    }

}
