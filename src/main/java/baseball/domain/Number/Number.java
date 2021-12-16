package baseball.domain.Number;

import java.util.ArrayList;

import static baseball.domain.Number.NumberFormat.*;

public class Number {
	ArrayList<Integer> numbers = new ArrayList<>(NUMBER_COUNT.getNumber());

	public Number() {}

	public Number(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public Number(String numbers) {
		for (String number : numbers.split(SPLIT.getValue())) {
			this.numbers.add(Integer.parseInt(number));
		}
	}

	public ArrayList<Integer> getNumbers() {
		return this.numbers;
	}
}
