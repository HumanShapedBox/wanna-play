package IWantToPlayAGame.unt;

import java.util.ArrayList;

import IWantToPlayAGame.Main;
import IWantToPlayAGame.View;
import IWantToPlayAGame.units.BaseHero;

public class Game {

    public static void game(ArrayList<BaseHero> good, ArrayList<BaseHero> bad, ArrayList<BaseHero> unitedList) {
        
        start(good, bad, unitedList);
        while (true) {
            unitedList = NewHeroes.unitSort(good, bad);
            nextMove(good, bad, unitedList);
            View.view();
            if(endGame(good) == true || endGame(bad) == true){
                System.out.println("GAMEOVER");
                return;
            }
            Main.sc.nextLine();
        }        
    }

    private static void start(ArrayList<BaseHero> good, ArrayList<BaseHero> bad, ArrayList<BaseHero> unitedList){
        NewHeroes.units(good, bad);
        unitedList.addAll(NewHeroes.unitSort(good, bad));
        View.view();
    }

    private static void nextMove(ArrayList<BaseHero> good, ArrayList<BaseHero> bad, ArrayList<BaseHero> unitedList){
        for (BaseHero unit : unitedList) {
            if (good.contains(unit))
                unit.step(good, bad);
            else
                unit.step(bad, good);
        }
    }

    private static Boolean endGame(ArrayList<BaseHero> units){
        Boolean flag = false;
        int counter = 0;
        for (BaseHero human : units) {
            if(human.getHp() <= 0) counter += 1;
        }
        if (counter == 10) {flag = true;}
        return flag;
    }

}