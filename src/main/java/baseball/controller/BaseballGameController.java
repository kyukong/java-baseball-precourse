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
		// 입력한 값과 정답 비교하여 힌트 생성
		// 힌트 출력
		// 힌트에 따른 결과 처리 - 다시 입력받음, 게임 재시작여부 확인
	}

	private void createCorrect() {
		game.createCorrect();
	}

	private void insertNumbers() {
		printInputNumbers();

		game.answer(inputNumbers());
	}
}
