package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface{
    
    public float hp, maxHp;
    public final String name;
    protected Position position;
    public int x, y;
    protected int attack;
    protected int defeat;
    protected int[] damage;
    protected int accuracy;
    public int speed;
    protected String state;

    public BaseHero(float hp, String name, Position position, int x, int y, int attack, 
                    Random defeat, int[] damage, Random accuracy, int speed, String state){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.position = new Position(x, y);
        this.attack = attack;
        this.defeat = new Random().nextInt(2);
        this.damage = damage;
        this.accuracy = new Random().nextInt(2);
        this.speed = speed;
        this.state = state;
    }

    // @Override
    // public String toString() {
    //     return name +
    //             " H:" + Math.round(hp) +
    //             " D:" + defense +
    //             " A:" + attack +
    //             " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
    //             " " + state;
    // }

    public int[] getCoords() {return new int[]{position.x, position.y};}

    @Override
    public void step(ArrayList<BaseHero> crew, ArrayList<BaseHero> enemy) {}

}
