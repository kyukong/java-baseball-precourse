package baseball.service;

import baseball.repository.CorrectRepository;

public class BaseballGame {
	private CorrectRepository correct;

	public BaseballGame() {}

	public void createCorrect() {
		correct = new CorrectRepository();
	}

	// 사용자 입력값을 이용하여 사용자 답 설정

	// 사용자 입력값과 정답 비교하여 힌트 설정

	// 힌트에 따른 결과 출력
}
