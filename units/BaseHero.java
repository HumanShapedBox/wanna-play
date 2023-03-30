package IWantToPlayAGame.units;

import java.util.Random;

public abstract class BaseHero implements GameInterface {
    
    float hp, maxHp;
    public String name;
    int x, y;
    int attack;
    public int defeat;
    int[] damage;
    int accuracy;
    int[] distance;

    public BaseHero(float hp, String name, int x, int y, int attack, 
                    Random defeat, int[] damage, Random accuracy, int[] distance){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.attack = attack;
        this.defeat = new Random().nextInt(2);
        this.damage = damage;
        this.accuracy = new Random().nextInt(2);
        this.distance = distance;
    }
    
    @Override
    public void step() {}
}
