package IWantToPlayAGame.units.sub_units;

import java.util.Random;

import IWantToPlayAGame.AnsiColors;
import IWantToPlayAGame.units.Position;
import IWantToPlayAGame.units.Warrior;

public class Thug extends Warrior{

    public Thug(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 3, 0, "stand");
    }

    @Override
    public String getInfo() {
        if (hp <= 0) {return AnsiColors.DEAD;
        }else return "Бандит " + name + " Здоровье: " + (int)hp;
    }
    
}
