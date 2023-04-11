package IWantToPlayAGame.unt;

import java.util.ArrayList;

import IWantToPlayAGame.units.BaseHero;

public class Game {

    public static void game(ArrayList<BaseHero> good, ArrayList<BaseHero> bad, ArrayList<BaseHero> sortedList) {
        // Boolean timeToGiveUp;
        for (BaseHero human : sortedList) {
            if (good.contains(human))
                human.step(good, bad);
                // timeToGiveUp = endGame(bad);
                // if (timeToGiveUp == true) {
                //     System.out.println("GAMEOVER");
                //     break;}
            else
                human.step(bad, good);
                // timeToGiveUp = endGame(good);
                // if (timeToGiveUp == true) {
                //     System.out.println("GAMEOVER");
                //     break;}
        }
        
    }

    // private static Boolean endGame(ArrayList<BaseHero> units){
    //     Boolean flag = false;
    //     int counter = 0;
    //     for (BaseHero human : units) {
    //         if(human.getHp() <= 0) counter += 1;
    //     }
    //     if (counter == 10) {flag = true;}
    //     return flag;
    // }

}