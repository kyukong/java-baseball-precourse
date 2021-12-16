package baseball.service;

import baseball.repository.AnswerRepository;
import baseball.repository.CorrectRepository;
import baseball.repository.HintRepository;

public class BaseballGame {
	private CorrectRepository correct;
	private AnswerRepository answer;
	private HintRepository hint;

	public BaseballGame() {}

	public void createCorrect() {
		correct = new CorrectRepository();
	}

	public void answer(String answer) {
		this.answer = new AnswerRepository(answer);
	}

	public void compare() {
		hint = new HintRepository(correct, answer);
	}

	// 힌트에 따른 결과 출력
}
