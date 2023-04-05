package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.methods.Position;

public abstract class BaseHero implements GameInterface {
    
    protected float hp, maxHp;
    public final String name;
    public Position position;
    public int x, y;
    protected int attack;
    protected int defeat;
    protected int[] damage;
    protected int accuracy;
    protected int[] distance;

    public BaseHero(float hp, String name, Position position, int x, int y, int attack, 
                    Random defeat, int[] damage, Random accuracy, int[] distance){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.position = new Position(x, y);
        this.attack = attack;
        this.defeat = new Random().nextInt(2);
        this.damage = damage;
        this.accuracy = new Random().nextInt(2);
        this.distance = distance;
    }
    
    @Override
    public void step(ArrayList<BaseHero> enemy) {}
}
