package com.manko;

import com.manko.controller.ConsoleController;
import com.manko.view.ConsoleView;

/**
 * Created by Yevheniia Manko on 09.11.2020.
 */
public class App {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        ConsoleController controller = new ConsoleController(view);
        controller.run();

    }
}
