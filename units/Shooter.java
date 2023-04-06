package IWantToPlayAGame.units;

import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.methods.Controller;
import IWantToPlayAGame.methods.Position;

public abstract class Shooter extends BaseHero{

    int arrows, maxArrows;
    int poisonedArrow;

    public Shooter(float hp, String name, Position position, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int speed, int arrows, int maxArrows, int poisonedArrow, String state) {

        super(hp, name, position, x, y, attack, defeat, damage, accuracy, speed, state);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.poisonedArrow = poisonedArrow;
    }

    protected void shoot(){
        System.out.println("Shoot!");
    }

    private Boolean findFeeder(ArrayList<BaseHero> units){
        Boolean flag = false;
        for(int i = 0; i < units.size(); i++){
            if(units.get(i).speed == 1 && units.get(i).state == "stand"){
                flag = true;
            }
        }
        return flag;
    }  

    @Override
    public void step(ArrayList<BaseHero> crew, ArrayList<BaseHero> enemy){
        if ((arrows == 0) || (hp <= 0)){
            return;
        }
        Position target = new Position(0, 0);
        target = target.findTarget(enemy);
        String nameTarget = "";
        for(int i = 0; i < enemy.size(); i++){
            if (enemy.get(i).position == target){
               nameTarget = enemy.get(i).name;
            }
        }
        System.out.println(name + " нападает на " + nameTarget);
        if (this.accuracy != 0){
            if(findFeeder(crew) == true){
                enemy = Controller.getHit(target, this.attack, this.accuracy, enemy);
            } else{
                this.arrows -= 1;
                enemy = Controller.getHit(target, this.attack, this.accuracy, enemy);
            }
        } else{
            System.out.println(name + " промахнулся");
        }   
    }
    
}
