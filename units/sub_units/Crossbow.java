package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Shooter;

public class Crossbow extends Shooter {

    public Crossbow(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 5, 10, 10, 0, "stand");

    }


    @Override
    public String getInfo() {
        return name + " - Арбалетчик. Здоровье: " + (int)hp;
    }
    
}