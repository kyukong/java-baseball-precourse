package baseball.service;

import baseball.repository.AnswerRepository;
import baseball.repository.CorrectRepository;

public class BaseballGame {
	private CorrectRepository correct;
	private AnswerRepository answer;

	public BaseballGame() {}

	public void createCorrect() {
		correct = new CorrectRepository();
	}

	public void answer(String answer) {
		this.answer = new AnswerRepository(answer);
	}

	// 사용자 입력값과 정답 비교하여 힌트 설정

	// 힌트에 따른 결과 출력
}
