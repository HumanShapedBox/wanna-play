package IWantToPlayAGame;

import java.util.ArrayList;
import java.util.Scanner;

import IWantToPlayAGame.units.BaseHero;
import IWantToPlayAGame.unt.Game;
import IWantToPlayAGame.unt.NewHeroes;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<BaseHero> white = new ArrayList<>();
    public static ArrayList<BaseHero> red = new ArrayList<>();
    public static ArrayList<BaseHero> sortedList = new ArrayList<>();

    public static void main(String[] args) {

        NewHeroes.units(white, red);
        sortedList.addAll(NewHeroes.unitSort(white, red));
        View.view();
        while (true) {
            sortedList = NewHeroes.unitSort(white, red);
            Game.game(white, red, sortedList);
            View.view();
            Main.sc.nextLine();
        }
    }
}
