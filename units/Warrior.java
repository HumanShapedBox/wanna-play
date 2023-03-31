package IWantToPlayAGame.units;

import java.util.Random;

import IWantToPlayAGame.methods.Position;

public abstract class Warrior extends BaseHero{

    int combo;

    public Warrior(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int[] distance, int combo) {
    
        super(hp, name, position, x, y, attack, defeat, damage, accuracy, distance);
        
        this.combo = combo;
    }
}
