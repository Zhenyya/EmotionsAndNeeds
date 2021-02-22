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
        mainMenu.add("1 - start work with cards of emotions");
        mainMenu.add("2 - start work with cards of needs");
        mainMenu.add("3 - print the chosen cards of emotions");
        mainMenu.add("4 - print the chosen cards of needs");
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
        System.out.println(card);
        return getUserChoice("Please press <Q> to return to the main menu, " +
                "<Y> - if this card fits your mood, and <N> if doesn't");
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
