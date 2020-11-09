package com.manko.controller;

import com.manko.view.ConsoleView;

/**
 * Created by Yevheniia Manko on 09.11.2020.
 */
public class ConsoleController {

    private ConsoleView view;

    public ConsoleController (ConsoleView view) {
        this.view = view;
    }

    public void run() {
        String userChoice;
        do {
            userChoice = view.start();
            System.out.println("Your choice is " + userChoice);
        } while(!userChoice.equals("Q"));
    }
}
