package IWantToPlayAGame.units;

import java.util.Random;

public abstract class Shooter extends BaseHero {

    int arrows, maxArrows;
    int poisonedArrow;

    public Shooter(float hp, String name, int x, int y, int attack, Random defeat, int[] damage, Random accuracy,
            int[] distance, int arrows, int maxArrows, int poisonedArrow) {

        super(hp, name, x, y, attack, defeat, damage, accuracy, distance);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.poisonedArrow = poisonedArrow;
    }

    protected void shoot(){
        System.out.println("Shoot!");
    }

    @Override
    public void step(){
        System.out.println("Shooter");
    }
    
}
