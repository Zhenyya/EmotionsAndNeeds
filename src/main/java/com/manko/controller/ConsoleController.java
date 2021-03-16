package com.manko.controller;

import com.manko.model.enums.EmotionCard;
import com.manko.model.enums.NeedCard;
import com.manko.view.ConsoleView;

import java.util.HashSet;
import java.util.Set;

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
            System.out.println("Your choice is " + userChoice); // delete later
            switch (userChoice) {
                case "1":
                case "2":
                    workWithSetCards(getSetOfCards(userChoice));
                    break;
                case "3":
                    // some code
                    break;
                case "4":
                    // some code
                    break;
                case "Q":
                    view.quit();
                    break;
                default:
                    view.showInvalidInputMessage();
            }
        } while(!userChoice.equals("Q"));
    }

    private Set<String> getSetOfCards(String str) {
        Set<String> cards = new HashSet<>();
        if(str.equals("1")) {
            for (EmotionCard emotion : EmotionCard.values()) {
                cards.add(emotion.getNameUkr() + "\n" + emotion.name() + "\n" + emotion.getNameRus());
            }
        }
        if(str.equals("2")) {
            for (NeedCard emotion : NeedCard.values()) {
                cards.add(emotion.getNameUkr() + "\n" + emotion.name() + "\n" + emotion.getNameRus());
            }
        }
        return cards;
    }

    private void workWithSetCards(Set<String> setCards) {
        String userInput;
        for (String card : setCards) {
            userInput = view.workWithCard(card);
            if (userInput.equals("N")) {
                continue;
            }
            if (userInput.equals("Q")) {
                break;
            }
            // some code
            System.out.println("This card fits your mood!"); // delete later
        }
    }
}
