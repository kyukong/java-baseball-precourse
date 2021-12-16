package baseball.repository;

import java.util.ArrayList;
import baseball.domain.Number.Correct;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static baseball.type.NumberFormat.*;

public class CorrectRepository extends Correct {

	public CorrectRepository() {
		super(getRandomNumbers());
	}

	private static ArrayList<Integer> getRandomNumbers() {
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

	private static int getRandomNumber() {
		return pickNumberInRange(NUMBER_MINIMUM.getNumber(), NUMBER_MAXIMUM.getNumber());
	}
}
