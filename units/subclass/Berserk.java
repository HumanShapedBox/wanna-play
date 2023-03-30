package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.units.Peasant;

public class Berserk extends Peasant{

    public Berserk(String name, int x, int y) {

        super(100, name, x, y, 5, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 1, 2 }, 0, 0, true);

    }
    
    @Override
    public String getInfo() {
        return name + " - Очень злой крестьянин";
    }
}