package IWantToPlayAGame;

import java.util.ArrayList;

import IWantToPlayAGame.methods.Controller;
import IWantToPlayAGame.units.BaseHero;

public class Main {

    public static void main(String[] args) {

        ArrayList<BaseHero> homies = new ArrayList<>();
        ArrayList<BaseHero> gang = new ArrayList<>();
        Controller.chooseYourFighter(homies, gang);
        System.out.println("Добряки:");
        homies.forEach(n -> System.out.println(n.getInfo()));
        Controller.emptyLine();
        System.out.println("Плохиши:");
        gang.forEach(n -> System.out.println(n.getInfo()));
    }
}
