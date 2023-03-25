package IWantToPlayAGame.units;

import java.util.Random;

public class BaseHero {
    
    float hp, maxHp;
    String name;
    int x, y;
    int attack;
    int defeat;
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
    
}
