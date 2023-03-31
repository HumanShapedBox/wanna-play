package IWantToPlayAGame.methods;

import java.util.ArrayList;

import IWantToPlayAGame.units.BaseHero;

public class SearchTarget extends Position{

    ArrayList<BaseHero> enemy;

    public SearchTarget(int x, int y, ArrayList<BaseHero> enemy) {
        super(x, y);
        this.enemy = enemy;
    }
    
    // public Position enemy(ArrayList<BaseHero> enemy){

    //     Position enemyPosition = new Position(1, 1);
    //     double minDist = distance(enemyPosition);
    //     for (int i = 1; i < enemy.size(); i++){
    //         double dist = distance(enemyPosition);
    //         //double dist = position.distance(enemy.get(i).position);
    //         if (dist < minDist){
    //             minDist = dist;
    //             enemyPosition = ;
    //         }
        
    //     }
    //     return enemyPosition;
    // }
}
