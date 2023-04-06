package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Scanner;

import IWantToPlayAGame.methods.Controller;
import IWantToPlayAGame.units.BaseHero;
//import IWantToPlayAGame.units.subclass.Archer;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<BaseHero> homies = new ArrayList<>();
        ArrayList<BaseHero> gang = new ArrayList<>();
        Controller.chooseYourFighter(homies, gang);
        System.out.println("Добряки:");
        homies.forEach(n -> System.out.println(n.getInfo()));
        Controller.emptyLine();
        System.out.println("Плохиши:");
        gang.forEach(n -> System.out.println(n.getInfo()));
        Controller.emptyLine();
        BaseHero attacker = Controller.attacker(gang);
        attacker.step(homies);
        Controller.emptyLine();
        homies.forEach(n -> System.out.println(n.getInfo()));
        // ArrayList<BaseHero> sortedList = new ArrayList<>();
        // sortedList.addAll(Controller.unitSpeedSort(homies, gang));
        // sortedList.forEach(n -> System.out.println(n.getInfo()));
        sc.close();
    }
}
