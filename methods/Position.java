package IWantToPlayAGame.methods;

import java.util.ArrayList;

import IWantToPlayAGame.units.BaseHero;

public class Position {
    
    protected int x, y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    private double distance(Position defence) {
        return Math.sqrt((defence.x - x) * (defence.x - x) + (defence.y - y) * (defence.y - y));
    }

    public Position findTarget(ArrayList<BaseHero> enemy){
        
        ArrayList<Position> targets = new ArrayList<>();
        for (int i = 0; i < enemy.size(); i++){
            targets.add(enemy.get(i).position);
        }
        
        Position findTarget = new Position(targets.get(0).x, targets.get(0).y);
        double minDist = distance(targets.get(0));
        for (int i = 1; i < targets.size(); i++){
            double dist = distance(targets.get(i));
            if (dist < minDist){
                minDist = dist;
                findTarget = targets.get(i);
            }
        }
        return findTarget;
    }
  
}
