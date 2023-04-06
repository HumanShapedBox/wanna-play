package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.methods.Position;
import IWantToPlayAGame.units.Peasant;

public class Feeder extends Peasant{

    public Feeder(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 0, new Random(), new int[] { 1, 8 },
                new Random(), 1, 1, 5, false, "stand");

    }

    @Override
    public String getInfo() {
        return name + " - Крестьянин. Здоровье: " + (int)hp;
    }
    
}
