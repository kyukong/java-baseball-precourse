package baseball.controller;

import baseball.service.BaseballGame;

import static baseball.view.Input.*;
import static baseball.view.Print.*;
import static baseball.type.GameType.*;

public class BaseballGameController {
	private BaseballGame game;

	public BaseballGameController(BaseballGame game) {
		this.game = game;
	}

	public void start() {
		createCorrect();
		play();
	}

	private void play() {
		insertNumbers();
		showHint();
		end();
	}

	private void createCorrect() {
		game.createCorrect();
	}

	private void insertNumbers() {
		printInputNumbers();

		game.answer(inputNumbers());
	}

	private void showHint() {
		game.compare();

		game.showHint();
	}

	private void end() {
		if (!game.isCorrect()) {
			play();
			return;
		}
		printWin();
		checkNewGame();
	}

	private void checkNewGame() {
		String newGameFlag = inputNewGameFlag();
		if (Integer.parseInt(newGameFlag) == NEW_GAME.getNumber()) {
			start();
		}
	}
}
