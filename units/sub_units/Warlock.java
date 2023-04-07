package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Wizard;

public class Warlock extends Wizard {

    public Warlock(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 2, 100, 100, 1, 10, 5, "stand");
    }

    @Override
    public String getInfo() {
        return "Чародей " + name + " Здоровье: " + (int)hp;
    }

}
