package baseball.controller;

import baseball.service.BaseballGame;

import static baseball.view.Input.*;
import static baseball.view.Print.*;

public class BaseballGameController {
	private BaseballGame game;

	public BaseballGameController(BaseballGame game) {
		this.game = game;
	}

	public void start() {
		createCorrect();
		insertNumbers();

		showHint();
		// 힌트에 따른 결과 처리 - 다시 입력받음, 게임 재시작여부 확인
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
}
