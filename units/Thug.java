package IWantToPlayAGame.units;

import java.util.Random;

public class Thug extends Warrior{

    public Thug(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 1, 2 }, 0);

    }

    @Override
    public String getInfo() {
        return "Thug";
    }
    
}
