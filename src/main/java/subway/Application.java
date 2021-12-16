package subway;

import subway.controller.LineController;
import subway.controller.MainController;
import subway.controller.StationController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        MainController mainController = new MainController();
        mainController.run();
    }
}
