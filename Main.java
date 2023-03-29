package IWantToPlayAGame;

import java.util.ArrayList;

import IWantToPlayAGame.units.Archer;
import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.units.Crossbow;
import IWantToPlayAGame.units.Knight;
import IWantToPlayAGame.units.Monk;
import IWantToPlayAGame.units.Peasant;
import IWantToPlayAGame.units.Thug;
import IWantToPlayAGame.units.Warlock;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> homies = new ArrayList<>();
        homies.add(new Archer("Кочерыжка", 1, 1));
        homies.add(new Archer("Витя-застрелю", 3, 1));
        homies.add(new Archer("Петрович", 6, 1));
        homies.add(new Knight("Рыжий", 2, 2));
        homies.add(new Knight("Кривой", 4, 2));
        homies.add(new Knight("Дыня", 5, 2));
        homies.add(new Knight("Пан Паратов", 7, 2));
        homies.add(new Monk("Химич", 5, 1));
        homies.add(new Peasant("Никто", 2, 1));
        homies.add(new Peasant("Никакой", 7, 1));

        ArrayList<BaseHero> gang = new ArrayList<>();
        gang.add(new Crossbow("Вася Штопор", 1, 8));
        gang.add(new Crossbow("Штота Счемта", 3, 8));
        gang.add(new Crossbow("Вася Фофан", 6, 8));
        gang.add(new Thug("Кудрявый", 2, 7));
        gang.add(new Thug("Ла Тунь", 4, 7));
        gang.add(new Thug("Бушрут", 5, 7));
        gang.add(new Thug("Коля Невкусный", 7, 7));
        gang.add(new Warlock("Гегель", 5, 1));
        gang.add(new Peasant("Гоголь", 2, 8));
        gang.add(new Peasant("Вилипут", 7, 8));

        gang.forEach(n -> System.out.println(n));
    }
}
