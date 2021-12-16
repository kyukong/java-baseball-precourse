package baseball.repository;

import java.util.ArrayList;

import baseball.domain.Number.Correct;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

import static baseball.domain.Number.NumberFormat.*;

public class CorrectRepository {
	public CorrectRepository() {
		new Correct(getRandomNumbers());
	}

	private ArrayList<Integer> getRandomNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>(NUMBER_COUNT.getNumber());

		int numberCount = 0;
		while(numberCount < NUMBER_COUNT.getNumber()) {
			int number = getRandomNumber();

			if (numbers.contains(number)) {
				continue;
			}
			numbers.add(number);
			numberCount++;
		}
		return numbers;
	}

	private int getRandomNumber() {
		return pickNumberInRange(NUMBER_MINIMUM.getNumber(), NUMBER_MAXIMUM.getNumber());
	}
}
