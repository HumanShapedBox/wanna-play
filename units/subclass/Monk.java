package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.units.Wizard;

public class Monk extends Wizard {

    
    public Monk(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 100, 100, 
                1, 10, 5);

    }

    @Override
    public String getInfo() {
        return name + " - Монах";
    }

}
