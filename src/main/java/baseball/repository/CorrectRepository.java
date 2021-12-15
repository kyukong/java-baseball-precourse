package baseball.repository;

import java.util.ArrayList;

import baseball.domain.Number.Correct;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class CorrectRepository {
	private final int NUMBER_COUNT = 3;
	private final int NUMBER_MINIMUM = 1;
	private final int NUMBER_MAXIMUM = 9;

	public CorrectRepository() {
		new Correct(getRandomNumbers());
	}

	private ArrayList<Integer> getRandomNumbers() {
		ArrayList<Integer> numbers = new ArrayList<>(NUMBER_COUNT);

		int numberCount = 0;
		while(numberCount < NUMBER_COUNT) {
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
		return pickNumberInRange(NUMBER_MINIMUM, NUMBER_MAXIMUM);
	}
}
