package IWantToPlayAGame.units;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Random;

public abstract class Warrior extends BaseHero{

    int combo;

    public Warrior(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int speed, int combo, String state) {
    
        super(hp, name, position, x, y, attack, defeat, damage, accuracy, speed, state);
        
        this.combo = combo;
    }

    protected Boolean stop(Position target){
        Boolean flag = false;
        if(target.distance(this.position) < 2) flag = true;
        return flag;
    }

    protected void move(Position target){
        int diffX = target.x - x;
        int diffY = target.y - y;

        if (stop(target) == true) {return;}

        if (Math.abs(diffX) > Math.abs(diffY))
            position.x += (int)Math.signum(diffX);
        else position.y += (int)Math.signum(diffY);
    }

    @Override
    public void step(ArrayList<BaseHero> crew, ArrayList<BaseHero> enemy){
        if (hp <= 0){return;}
        BaseHero target = findTarget(enemy);
        Position targetPosition = target.position;
        move(targetPosition);
        hit(target);
    }

    protected void hit(BaseHero target) {
        // int diffX = target.x - x;
        // int diffY = target.y - y;
        if (this.accuracy != 0 && target.position.distance(this.position) < 2) {
            target.hp -= this.attack;
            // if(diffX < 2 || diffY < 2)
            // target.hp -= attack;
            // } else return;
        } else return;
    }

}
