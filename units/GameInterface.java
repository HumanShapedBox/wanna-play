package IWantToPlayAGame.units;

import java.util.ArrayList;

public interface GameInterface {
    
    void step(BaseHero attacker, ArrayList<BaseHero> enemy);
    String getInfo();
}
