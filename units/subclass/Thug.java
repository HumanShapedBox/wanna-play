package IWantToPlayAGame.units.subclass;

import java.util.Random;

import IWantToPlayAGame.units.Warrior;

public class Thug extends Warrior{

    public Thug(String name, int x, int y) {

        super(100, name, x, y, 15, new Random(), new int[] { 1, 8 },
                new Random(), new int[] { 1, 2 }, 0);

    }

    @Override
    public String getInfo() {
        return name + " - Бандит";
    }
    
}
