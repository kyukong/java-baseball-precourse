package baseball.controller;

import baseball.service.BaseballGame;

public class BaseballGameController {
	private BaseballGame game;

	public BaseballGameController(BaseballGame game) {
		this.game = game;
	}

	public void start() {
		createCorrect();
		// 사용자 답 입력
		// 입력한 값과 정답 비교하여 힌트 생성
		// 힌트 출력
		// 힌트에 따른 결과 처리 - 다시 입력받음, 게임 재시작여부 확인
	}

	private void createCorrect() {
		game.createCorrect();
	}
}
