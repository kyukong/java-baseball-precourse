package baseball.repository;

import baseball.domain.Hint.Hint;
import java.util.ArrayList;

import static baseball.domain.Number.NumberFormat.*;

public class HintRepository {
	private int ball = 0;
	private int strike = 0;

	public HintRepository(CorrectRepository correct, AnswerRepository answer) {
		score(correct, answer);
		new Hint(ball, strike);
	}

	private void score(CorrectRepository correctRepository, AnswerRepository answerRepository) {
		ArrayList<Integer> correct = correctRepository.getNumbers();
		ArrayList<Integer> answer = answerRepository.getNumbers();
		for (int i = 0; i < NUMBER_COUNT.getNumber(); i++) {
			int nowAnswer = answer.get(i);
			if (!correct.contains(nowAnswer)) {
				continue;
			}
			if (nowAnswer == correct.indexOf(i)) {
				strike += ADD_HINT.getNumber();
				continue;
			}
			ball += ADD_HINT.getNumber();
		}
	}
}
