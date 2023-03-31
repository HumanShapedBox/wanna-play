package IWantToPlayAGame.methods;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import IWantToPlayAGame.Names;
import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.subclass.Archer;
import IWantToPlayAGame.units.subclass.Crossbow;
import IWantToPlayAGame.units.subclass.Feeder;
import IWantToPlayAGame.units.subclass.Knight;
import IWantToPlayAGame.units.subclass.Monk;
import IWantToPlayAGame.units.subclass.Thug;
import IWantToPlayAGame.units.subclass.Warlock;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    public static void chooseYourFighter(ArrayList<BaseHero> good, ArrayList<BaseHero> bad) {
        System.out.println("Введите '1' для случайной генерации персонажей\n"
                + "Введите '2' для получения основного состава игроков");
        // + "Введите '3' для самостоятельного формирования команды");
        int comand = sc.nextInt();
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
                    bad.add(new Crossbow(getName(), new Random().nextInt(4) + 5, new Random().nextInt(4) + 5));
                    break;
                case 1:
                    bad.add(new Thug(getName(), new Random().nextInt(4) + 5, new Random().nextInt(4) + 5));
                    break;
                case 2:
                    bad.add(new Warlock(getName(), new Random().nextInt(4) + 5, new Random().nextInt(4) + 5));
                    break;
                default:
                    bad.add(new Feeder(getName(), new Random().nextInt(4) + 5, new Random().nextInt(4) + 5));
                    break;
            }
        }
        return bad;
    }

    private static ArrayList<BaseHero> randomGood(ArrayList<BaseHero> good) {
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    good.add(new Archer(getName(), new Random().nextInt(4) + 1, new Random().nextInt(4) + 1));
                    break;
                case 1:
                    good.add(new Knight(getName(), new Random().nextInt(4) + 1, new Random().nextInt(4) + 1));
                    break;
                case 2:
                    good.add(new Monk(getName(), new Random().nextInt(4) + 1, new Random().nextInt(4) + 1));
                    break;
                default:
                    good.add(new Feeder(getName(), new Random().nextInt(4) + 1, new Random().nextInt(4) + 1));
                    break;
            }
        }
        return good;
    }
    
    private static ArrayList<BaseHero> gang(ArrayList<BaseHero> bad) {
        bad.add(new Crossbow(getName(), 1, 8));
        bad.add(new Crossbow(getName(), 3, 8));
        bad.add(new Crossbow(getName(), 6, 8));
        bad.add(new Thug(getName(), 2, 7));
        bad.add(new Thug(getName(), 4, 7));
        bad.add(new Thug(getName(), 5, 7));
        bad.add(new Thug(getName(), 7, 7));
        bad.add(new Warlock(getName(), 5, 1));
        bad.add(new Feeder(getName(), 2, 8));
        bad.add(new Feeder(getName(), 7, 8));
        return bad;
    }

    private static ArrayList<BaseHero> homies(ArrayList<BaseHero> good) {
        good.add(new Archer(getName(), 1, 1));
        good.add(new Archer(getName(), 3, 1));
        good.add(new Archer(getName(), 6, 1));
        good.add(new Knight(getName(), 2, 2));
        good.add(new Knight(getName(), 4, 2));
        good.add(new Knight(getName(), 5, 2));
        good.add(new Knight(getName(), 7, 2));
        good.add(new Monk(getName(), 5, 1));
        good.add(new Feeder(getName(), 2, 1));
        good.add(new Feeder(getName(), 7, 1));
        return good;
    }

    public static void emptyLine(){
        System.out.println("*****");
    }

}
