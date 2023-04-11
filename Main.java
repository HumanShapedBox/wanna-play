package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Scanner;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.unt.Game;
import IWantToPlayAGame.unt.NewHeroes;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<BaseHero> homies = new ArrayList<>();
    public static ArrayList<BaseHero> gang = new ArrayList<>();
    public static ArrayList<BaseHero> sortedList = new ArrayList<>();

    public static void main(String[] args) {

        NewHeroes.units(homies, gang);
        sortedList.addAll(NewHeroes.unitSort(homies, gang));
        View.view();
        while (true) {
            sortedList = NewHeroes.unitSort(homies, gang);
            Game.game(homies, gang, sortedList);
            View.view();
            Main.sc.nextLine();
        }
    }
}
