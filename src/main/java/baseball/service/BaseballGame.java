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
		hint = new HintRepository();
		hint.score(correct, answer);
	}

	public void showHint() {
		hint.show();
	}
}
