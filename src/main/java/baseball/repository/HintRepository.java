package baseball.repository;

import baseball.domain.Hint.Hint;
import java.util.ArrayList;

import static baseball.domain.Number.NumberFormat.*;

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
			if (nowAnswer == correct.indexOf(i)) {
				addBall();
				continue;
			}
			addStrike();
		}
	}
}
