package IWantToPlayAGame.units.sub_units;

// import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Shooter;

public class Archer extends Shooter{

    public Archer(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 5, 10, 10, 0, "stand");

    }

    @Override
    public String getInfo() {
        return "Лучник " + name + "Здоровье: " + (int)hp;
    }

}
