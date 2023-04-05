package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.methods.Position;
import IWantToPlayAGame.units.Shooter;

public class Crossbow extends Shooter {

    public Crossbow(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), 5, 10, 10, 0);

    }


    @Override
    public String getInfo() {
        return name + " - Арбалетчик";
    }
    
}
