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
        System.out.println("Please, select the menu point.");
        return scanner.nextLine().toUpperCase();
    }

    public String workWithCard(String card) {
        System.out.println(card);
        System.out.println("Does this card fit your mood? \\nPlease, input <Y> if it does or <N> if it doesn't");
        return scanner.nextLine().toUpperCase();
    }
}
