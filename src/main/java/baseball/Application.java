package baseball;

import baseball.controller.BaseballGameController;
import baseball.service.BaseballGame;

public class Application {
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        BaseballGameController controller = new BaseballGameController(game);

        controller.start();
    }
}
