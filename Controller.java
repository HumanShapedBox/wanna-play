package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.sub_units.Archer;
import IWantToPlayAGame.units.sub_units.Crossbow;
import IWantToPlayAGame.units.sub_units.Feeder;
import IWantToPlayAGame.units.sub_units.Knight;
import IWantToPlayAGame.units.sub_units.Monk;
import IWantToPlayAGame.units.sub_units.Thug;
import IWantToPlayAGame.units.sub_units.Warlock;

public class Controller {

    public static void game(ArrayList<BaseHero> good, ArrayList<BaseHero> bad, ArrayList<BaseHero> sortedList) {
        for (BaseHero human : sortedList) {
            if (good.contains(human))
                human.step(good, bad);
            else
                human.step(bad, good);
        }
    }

    public static void chooseYourFighter(ArrayList<BaseHero> good, ArrayList<BaseHero> bad) {
        System.out.println("Введите '1' для случайной генерации персонажей\n"
                + "Введите '2' для получения основного состава игроков");
        
        int comand = Main.sc.nextInt();
        if (comand == 1) {
            randomGood(good);
            randomBad(bad);
        } else {
            homies(good);
            gang(bad);
        }        
    }

    public static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    private static ArrayList<BaseHero> randomBad(ArrayList<BaseHero> bad) {
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    bad.add(new Crossbow(getName(), i + 1, 10));
                    break;
                case 1:
                    bad.add(new Thug(getName(), i + 1, 10));
                    break;
                case 2:
                    bad.add(new Warlock(getName(), i + 1, 10));
                    break;
                default:
                    bad.add(new Feeder(getName(), i + 1, 10));
                    break;
            }
        }
        return bad;
    }

    private static ArrayList<BaseHero> randomGood(ArrayList<BaseHero> good) {
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    good.add(new Archer(getName(), i + 1, 1));
                    break;
                case 1:
                    good.add(new Knight(getName(), i + 1, 1));
                    break;
                case 2:
                    good.add(new Monk(getName(), i + 1, 1));
                    break;
                default:
                    good.add(new Feeder(getName(), i + 1, 1));
                    break;
            }
        }
        return good;
    }
    
    private static ArrayList<BaseHero> gang(ArrayList<BaseHero> bad) {
        bad.add(new Crossbow(getName(), 1, 10));
        bad.add(new Crossbow(getName(), 2, 10));
        bad.add(new Crossbow(getName(), 3, 10));
        bad.add(new Thug(getName(), 4, 10));
        bad.add(new Thug(getName(), 5, 10));
        bad.add(new Thug(getName(), 6, 10));
        bad.add(new Thug(getName(), 7, 10));
        bad.add(new Warlock(getName(), 8, 10));
        bad.add(new Feeder(getName(), 9, 10));
        bad.add(new Feeder(getName(), 10, 10));
        return bad;
    }

    private static ArrayList<BaseHero> homies(ArrayList<BaseHero> good) {
        good.add(new Archer(getName(), 1, 1));
        good.add(new Archer(getName(), 2, 1));
        good.add(new Archer(getName(), 3, 1));
        good.add(new Knight(getName(), 4, 1));
        good.add(new Knight(getName(), 5, 1));
        good.add(new Knight(getName(), 6, 1));
        good.add(new Knight(getName(), 7, 1));
        good.add(new Monk(getName(), 8, 1));
        good.add(new Feeder(getName(), 9, 1));
        good.add(new Feeder(getName(), 10, 1));
        return good;
    }

    public static ArrayList<BaseHero> unitSpeedSort(ArrayList<BaseHero> crew, ArrayList<BaseHero> enemy) {
        ArrayList<BaseHero> sortedList = new ArrayList<>();
        sortedList.addAll(crew);
        sortedList.addAll(enemy);
        for (BaseHero human : sortedList) {
            human.lifeChecker();
        }
        Collections.sort(
                sortedList,
                new Comparator<BaseHero>() {
                    public int compare(BaseHero t0, BaseHero t1) {
                        if (t0.getSpeed() > t1.getSpeed())
                            return -1;
                        if (t0.getSpeed() < t1.getSpeed())
                            return 1;
                        if(t0.getSpeed() == t1.getSpeed()){
                            return (int)t1.getHp() - (int)t0.getHp();
                        }
                        return 0;
                    }
                });
        return sortedList;
    }
    
    public static BaseHero attacker(ArrayList<BaseHero> units){
        Collections.sort(
                units,
                new Comparator<BaseHero>() {
                    public int compare(BaseHero t0, BaseHero t1) {
                        if (t0.getSpeed() > t1.getSpeed())
                            return -1;
                        if (t0.getSpeed() < t1.getSpeed())
                            return 1;
                        if(t0.getSpeed() == t1.getSpeed()){
                            return (int)t1.getHp() - (int)t0.getHp();
                        }
                        return 0;
                    }
                });
        return units.get(0);
    }

}
