package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Warrior;

public class Knight extends Warrior{

    public Knight(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 3, 0, "stand");

    }

    @Override
    public String getInfo() {
        return name + " - Рыцарь. Здоровье: " + (int)hp;
    }
    
}
