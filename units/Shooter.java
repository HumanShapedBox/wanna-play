package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;
import IWantToPlayAGame.methods.Position;

public abstract class Shooter extends BaseHero {

    int arrows, maxArrows;
    int poisonedArrow;

    public Shooter(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int[] distance, int arrows, int maxArrows, int poisonedArrow) {

        super(hp, name, position, x, y, attack, defeat, damage, accuracy, distance);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.poisonedArrow = poisonedArrow;
    }

    protected void shoot(){
        System.out.println("Shoot!");
    }

    @Override
    public void step(ArrayList<BaseHero> enemy){
        if ((arrows == 0) || (hp <= 0)){
            return;
        }
        // double minDist = position.distance(enemy.get(0).position);
        // int enemyPosition = 0;
        // for (int i = 1; i < enemy.size(); i++){
        //     double dist = position.distance(enemy.get(i).position);
        //     if (dist < minDist){
        //         minDist = dist;
        //         enemyPosition = i;
        //     }
        
        // }
        System.out.println("Shooter");
    }
    
}
