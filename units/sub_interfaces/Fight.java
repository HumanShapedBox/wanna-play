package IWantToPlayAGame.units.sub_interfaces;

import java.util.ArrayList;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.GameInterface;

public interface Fight extends GameInterface {
    
    public BaseHero findTarget(ArrayList<BaseHero> enemy);
}
