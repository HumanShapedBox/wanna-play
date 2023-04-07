package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Scanner;

import IWantToPlayAGame.units.BaseHero;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<BaseHero> homies = new ArrayList<>();
    public static ArrayList<BaseHero> gang = new ArrayList<>();
    public static ArrayList<BaseHero> sortedList = new ArrayList<>();
    public static void main(String[] args) {

        // ArrayList<BaseHero> homies = new ArrayList<>();
        // ArrayList<BaseHero> gang = new ArrayList<>();
        // ArrayList<BaseHero> sortedList = new ArrayList<>();

        Controller.chooseYourFighter(homies, gang);
        sortedList.addAll(Controller.unitSpeedSort(homies, gang));

        View.view();
        // System.out.println("Добряки:");
        // homies.forEach(n -> System.out.println(n.getInfo()));
        // Controller.emptyLine();

        // System.out.println("Плохиши:");
        // gang.forEach(n -> System.out.println(n.getInfo()));
        // Controller.emptyLine();
        
        // BaseHero attacker = Controller.attacker(gang); // в контроллере сделай "некст мув" со счётчиком, а атакера унеси в приват и передавай муву
        // attacker.step(gang, homies);
        //Controller.emptyLine();

        // homies.forEach(n -> System.out.println(n.getInfo()));
        //Controller.emptyLine();
        // gang.forEach(n -> System.out.println(n.getInfo()));
        // attacker = Controller.attacker(homies);
        // attacker.step(homies, gang);
        // Controller.emptyLine();
        // homies.forEach(n -> System.out.println(n.getInfo()));
        // Controller.emptyLine();
        // gang.forEach(n -> System.out.println(n.getInfo()));
        sc.close();
    }
}
