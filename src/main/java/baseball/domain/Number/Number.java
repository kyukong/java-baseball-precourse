package baseball.domain.Number;

import java.util.ArrayList;

public class Number {
	public static final int NUMBER_COUNT = 3;
	public static final String SPLIT = "";

	ArrayList<Integer> numbers = new ArrayList<>(NUMBER_COUNT);

	Number() {}

	public Number(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public Number(String numbers) {
		for (String number : numbers.split(SPLIT)) {
			this.numbers.add(Integer.parseInt(number));
		}
	}
}
