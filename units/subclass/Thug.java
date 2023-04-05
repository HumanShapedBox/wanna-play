package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.methods.Position;
import IWantToPlayAGame.units.Warrior;

public class Thug extends Warrior{

    public Thug(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 3, 0);

    }

    @Override
    public String getInfo() {
        return name + " - Бандит";
    }
    
}
