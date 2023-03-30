package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.units.Shooter;

public class Archer extends Shooter{

    public Archer(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 3, 4, 5 }, 10, 10, 0);

    }

    @Override
    public String getInfo() {
        return name + " - Лучник";
    }
    
}
