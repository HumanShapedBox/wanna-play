package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;
import IWantToPlayAGame.methods.Position;

public abstract class Shooter extends BaseHero{

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
        String nameTarget = "";
        Position target = new Position(0, 0);
        target.findTarget(enemy);
        for(int i = 0; i < enemy.size(); i++){
            if (position == target){
                nameTarget = target.nameTarget(enemy);
            }
            System.out.println(nameTarget);
        }
    }
    
}
