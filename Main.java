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

        Controller.chooseYourFighter(homies, gang);
        sortedList.addAll(Controller.unitSpeedSort(homies, gang));
        View.view();
        while (true) {
            sortedList = Controller.unitSpeedSort(homies, gang);
            Controller.game(homies, gang, sortedList);
            View.view();
            Main.sc.nextLine();
        }
    }
}
