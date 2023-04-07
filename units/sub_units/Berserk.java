package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.units.Peasant;
import IWantToPlayAGame.units.Position;

public class Berserk extends Peasant{

    public Berserk(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 5, new Random(), new int[] { 1, 8 },
                new Random(), 10, 0, 0, true, "stand");

    }
    
    @Override
    public String getInfo() {
        return "Rage " + name + " Здоровье: " + (int)hp;
    }
}