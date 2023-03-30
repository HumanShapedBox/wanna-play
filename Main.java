package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Random;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.subclass.Archer;
import IWantToPlayAGame.units.subclass.Crossbow;
import IWantToPlayAGame.units.subclass.Feeder;
import IWantToPlayAGame.units.subclass.Knight;
import IWantToPlayAGame.units.subclass.Monk;
import IWantToPlayAGame.units.subclass.Thug;
import IWantToPlayAGame.units.subclass.Warlock;

public class Main {
    public static void main(String[] args) {
        // ArrayList<BaseHero> homies = new ArrayList<>();
        // homies.add(new Archer(getName(), 1, 1));
        // homies.add(new Archer(getName(), 3, 1));
        // homies.add(new Archer(getName(), 6, 1));
        // homies.add(new Knight(getName(), 2, 2));
        // homies.add(new Knight(getName(), 4, 2));
        // homies.add(new Knight(getName(), 5, 2));
        // homies.add(new Knight(getName(), 7, 2));
        // homies.add(new Monk(getName(), 5, 1));
        // homies.add(new Feeder(getName(), 2, 1));
        // homies.add(new Feeder(getName(), 7, 1));

        // ArrayList<BaseHero> gang = new ArrayList<>();
        // gang.add(new Crossbow(getName(), 1, 8));
        // gang.add(new Crossbow(getName(), 3, 8));
        // gang.add(new Crossbow(getName(), 6, 8));
        // gang.add(new Thug(getName(), 2, 7));
        // gang.add(new Thug(getName(), 4, 7));
        // gang.add(new Thug(getName(), 5, 7));
        // gang.add(new Thug(getName(), 7, 7));
        // gang.add(new Warlock(getName(), 5, 1));
        // gang.add(new Feeder(getName(), 2, 8));
        // gang.add(new Feeder(getName(), 7, 8));

        gang.forEach(n -> System.out.println(n.getInfo()));
        
        //gang.forEach(n -> System.out.println(n.defeat)); // Контролирую рандом, потом уберу
    }

    private static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    private ArrayList<BaseHero> randomUnits(){
        ArrayList<BaseHero> randomUnits = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(10)){
                case 0:
                    randomUnits.add(new Crossbow(getName(), 1, 8));
                    break;
                case 1:
                    randomUnits.add(new Crossbow(getName(), 3, 8));
                    break;
                case 2:
                    randomUnits.add(new Crossbow(getName(), 6, 8));
                    break;
                case 3:
                    randomUnits.add(new Thug(getName(), 2, 7));
                    break;
                case 4:
                    randomUnits.add(new Thug(getName(), 4, 7));
                    break;
                case 5:
                    randomUnits.add(new Thug(getName(), 5, 7));
                    break;
                case 6:
                    randomUnits.add(new Thug(getName(), 7, 7));
                    break;
                    randomUnits.add(new Warlock(getName(), 5, 1));
                    randomUnits.add(new Feeder(getName(), 2, 8));
                    randomUnits.add(new Feeder(getName(), 7, 8));
            }
        }
        return randomUnits;
    }
}
