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
        homies.add(new Infantry("Рыжий", 2, 2));
        homies.add(new Infantry("Кривой", 4, 2));
        homies.add(new Infantry("Дыня", 5, 2));
        homies.add(new Infantry("Пан Паратов", 7, 2));
        homies.add(new Wizard("Химич", 5, 1));
        homies.add(new Peasant("Никто", 2, 1));
        homies.add(new Peasant("Никакой", 7, 1));

        ArrayList<BaseHero> gang = new ArrayList<>();
        gang.add(new Sniper("Вася Штопор", 1, 8));
        gang.add(new Sniper("Штота Счемта", 3, 8));
        gang.add(new Sniper("Дон Домино", 6, 8));
        gang.add(new Infantry("Кудрявый", 2, 7));
        gang.add(new Infantry("Ла Тунь", 4, 7));
        gang.add(new Infantry("Лохштедт", 5, 7));
        gang.add(new Infantry("Коля Невкусный", 7, 7));
        gang.add(new Wizard("Гегель", 5, 1));
        homies.add(new Peasant("Гоголь", 2, 8));
        homies.add(new Peasant("Вилипут", 7, 8));
    }
}
