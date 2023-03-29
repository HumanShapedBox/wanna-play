package IWantToPlayAGame.units;

import java.util.Random;

public class Warrior extends BaseHero{

    int combo;

    public Warrior(float hp, String name, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int[] distance, int combo) {
    
        super(hp, name, x, y, attack, defeat, damage, accuracy, distance);
        
        this.combo = combo;
    }
}
