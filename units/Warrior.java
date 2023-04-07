package IWantToPlayAGame.units;

import java.util.Random;

public abstract class Warrior extends BaseHero{

    int combo;

    public Warrior(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int speed, int combo, String state) {
    
        super(hp, name, position, x, y, attack, defeat, damage, accuracy, speed, state);
        
        this.combo = combo;
    }
}
