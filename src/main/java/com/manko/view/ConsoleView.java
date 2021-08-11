package com.manko.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Yevheniia Manko on 09.11.2020.
 */
public class ConsoleView {

    private Scanner scanner;
    private List<String> mainMenu;

    public ConsoleView() {
        scanner = new Scanner(System.in);
        mainMenu = new ArrayList<>();
        mainMenu.add("1 - work with cards of EMOTIONS");
        mainMenu.add("2 - work with cards of NEEDS");
        mainMenu.add("3 - print the chosen cards of EMOTIONS");
        mainMenu.add("4 - print the chosen cards of NEEDS");
        mainMenu.add("Q - exit");
    }

    private void showMainMenu() {
        System.out.println("\nMENU:");
        for (String str : mainMenu) {
            System.out.println(str);
        }
    }

    public String start() {
        showMainMenu();
        return getUserChoice("Please, select the menu point.");
    }

    public String workWithCard(String card) {
        System.out.println("\n" + card);
        return getUserChoice("Please press any key except <N> or <Q> if this card fits your mood, " +
                "<N> if doesn't, and <Q> to return to the main menu");
    }

    private String getUserChoice(String message) {
        System.out.println(message);
        return scanner.nextLine().toUpperCase();
    }

    public void quit() {
        System.out.println("Thank you for using my application. Have a good mood!");
        scanner.close();
    }

    public void showInvalidInputMessage() {
        System.out.println("You entered an invalid point of menu.");
    }
}
