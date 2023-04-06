package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.methods.Position;

public abstract class BaseHero implements GameInterface {
    
    public float hp, maxHp;
    public final String name;
    public Position position;
    public int x, y;
    protected int attack;
    protected int defeat;
    protected int[] damage;
    protected int accuracy;
    public int speed;

    public BaseHero(float hp, String name, Position position, int x, int y, int attack, 
                    Random defeat, int[] damage, Random accuracy, int speed){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.position = new Position(x, y);
        this.attack = attack;
        this.defeat = new Random().nextInt(2);
        this.damage = damage;
        this.accuracy = new Random().nextInt(2);
        this.speed = speed;
    }

    @Override
    public void step(BaseHero attacker, ArrayList<BaseHero> enemy) {}

}
