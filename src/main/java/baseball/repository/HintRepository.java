package baseball.repository;

import baseball.domain.Hint.Hint;
import java.util.ArrayList;

import static baseball.type.NumberFormat.*;
import static baseball.type.HintType.*;
import static baseball.view.Print.*;

public class HintRepository extends Hint {
	public HintRepository() {
		super();
	}

	public void score(CorrectRepository correctRepository, AnswerRepository answerRepository) {
		ArrayList<Integer> correct = correctRepository.getNumbers();
		ArrayList<Integer> answer = answerRepository.getNumbers();
		for (int i = 0; i < NUMBER_COUNT.getNumber(); i++) {
			int nowAnswer = answer.get(i);
			if (!correct.contains(nowAnswer)) {
				continue;
			}
			if (nowAnswer == correct.get(i)) {
				addStrike();
				continue;
			}
			addBall();
		}
	}

	public void show() {
		String hintMessage = getHintMessage();
		printHint(hintMessage);
	}

	private String getHintMessage() {
		String hintMessage = "";

		if (this.getBall() != 0) {
			hintMessage += this.getBall() + BALL.getName() + " ";
		}
		if (this.getStrike() != 0) {
			hintMessage += this.getStrike() + STRIKE.getName();
		}
		if (hintMessage.equals("")) {
			hintMessage += NOTHING.getName();
		}
		return hintMessage;
	}

	public boolean isCorrect() {
		return this.getStrike() == NUMBER_COUNT.getNumber();
	}
}
