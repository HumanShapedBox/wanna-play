package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.AnsiColors;
import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Wizard;

public class Monk extends Wizard {

    
    public Monk(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 10, new Random(), new int[] { 1, 8 },
                new Random(), 2, 100, 100, 1, 10, 5, "stand");

    }

    @Override
    public String getInfo() {
        if (hp <= 0) {return AnsiColors.DEAD;
        }else return "Монах " + name + " Здоровье: " + (int)hp;
    }

}
