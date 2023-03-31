package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.methods.Position;
import IWantToPlayAGame.units.Warrior;

public class Knight extends Warrior{

    public Knight(String name, int x, int y) {

        super(100, name, new Position(x, y), x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 1, 2 }, 0);

    }

    @Override
    public String getInfo() {
        return name + " - Рыцарь";
    }
    
}
