package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Scanner;

import IWantToPlayAGame.units.BaseHero;

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
        attacker.step(gang, homies);
        Controller.emptyLine();
        
        homies.forEach(n -> System.out.println(n.getInfo()));
        // Controller.emptyLine();
        // gang.forEach(n -> System.out.println(n.getInfo()));
        // ArrayList<BaseHero> sortedList = new ArrayList<>();
        // sortedList.addAll(Controller.unitSpeedSort(homies, gang));
        // sortedList.forEach(n -> System.out.println(n.getInfo()));
        sc.close();
    }
}
