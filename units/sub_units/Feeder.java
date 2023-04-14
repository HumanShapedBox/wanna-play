package IWantToPlayAGame.units.sub_units;

import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.AnsiColors;
import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.Peasant;
import IWantToPlayAGame.units.Position;

public class Feeder extends Peasant{

    public Feeder(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 0, new Random(), new int[] { 1, 8 },
                new Random(), 1, 1, 5, false, "stand");

    }

    @Override
    public String getInfo() {
        if (hp <= 0) {return AnsiColors.DEAD;
        }else return "Крестьянин " + name + " Здоровье: " + (int)hp;
    }

    public Boolean berserkMode(ArrayList<BaseHero> crew){
        Boolean flag = false;
        int counter = activeUnits(crew);
        if (counter == 0) flag = true;
        return flag;
    }
    
}
