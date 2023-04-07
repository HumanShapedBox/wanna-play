package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements GameInterface{
    
    public float hp, maxHp;
    public final String name;
    protected Position position;
    protected int x, y;
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

    // protected BaseHero findTarget(ArrayList<BaseHero> enemy) {
    //     float dist = 1000.0f; // любое число большее диагонали поля.
    //     BaseHero target = null;
    //     for (int i = 0; i < enemy.size(); i++) {
    //         if (enemy.get(i).position.distance(this.position) < dist) {
    //             dist = enemy.get(i).position.distance(this.position);
    //             target = enemy.get(i);
    //         }
    //     }
    // }


    @Override
    public void step(ArrayList<BaseHero> crew, ArrayList<BaseHero> enemy) {}

}
