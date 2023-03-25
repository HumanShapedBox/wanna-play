package IWantToPlayAGame;

import java.util.ArrayList;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.Infantry;
import IWantToPlayAGame.units.Peasant;
import IWantToPlayAGame.units.Sniper;
import IWantToPlayAGame.units.Wizard;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> homies = new ArrayList<>();
        homies.add(new Sniper("Кочерыжка", 1, 1));
        homies.add(new Sniper("Витя-застрелю", 3, 1));
        homies.add(new Sniper("Петрович", 6, 1));
        homies.add(new Infantry("", 2, 2));
        homies.add(new Infantry("", 4, 2));
        homies.add(new Infantry("", 5, 2));
        homies.add(new Infantry("", 7, 2));
        homies.add(new Wizard("", 5, 1));
        homies.add(new Peasant("", 2, 1));
        homies.add(new Peasant("", 7, 1));

        ArrayList<BaseHero> gang = new ArrayList<>();
        gang.add(new Sniper("", 1, 8));
        gang.add(new Sniper("", 3, 8));
        gang.add(new Sniper("", 6, 8));
        gang.add(new Infantry("", 2, 7));
        gang.add(new Infantry("", 4, 7));
        gang.add(new Infantry("", 5, 7));
        gang.add(new Infantry("", 7, 7));
        gang.add(new Wizard("", 5, 1));
        homies.add(new Peasant("", 2, 8));
        homies.add(new Peasant("", 7, 8));
    }
}
