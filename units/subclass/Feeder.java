package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.units.Peasant;

public class Feeder extends Peasant{

    public Feeder(String name, int x, int y) {

        super(100, name, x, y, 0, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 1, 2 }, 1, 5, false);

    }

    @Override
    public String getInfo() {
        return name + " - Крестьянин";
    }
    
}
