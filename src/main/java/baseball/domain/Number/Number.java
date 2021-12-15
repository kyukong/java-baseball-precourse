package baseball.domain.Number;

import java.util.ArrayList;

public class Number {
	private static final int NUMBER_COUNT = 3;
	private static final String SPLIT = "";

	ArrayList<Integer> numbers = new ArrayList<>(NUMBER_COUNT);

	Number() {}

	public Number(String numbers) {
		for (String number : numbers.split(SPLIT)) {
			this.numbers.add(Integer.parseInt(number));
		}
	}
}
