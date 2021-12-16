package baseball.validator;

import java.util.Arrays;
import java.util.HashSet;

import static baseball.domain.Number.Number.NUMBER_COUNT;
import static baseball.domain.Number.Number.SPLIT;
import static baseball.repository.CorrectRepository.NUMBER_MINIMUM;
import static baseball.repository.CorrectRepository.NUMBER_MAXIMUM;

public class Validator {
	private static void throwError() {
		throw new IllegalArgumentException();
	}

	public static void validateNumbers(String str) {
		if (!isProperLength(str)) {
			throwError();
		}
		String[] numbers = str.split(SPLIT);
		for (String number : numbers) {
			if (!isProperNumber(number)) {
				throwError();
			}
		}
		if (isDuplicated(numbers)) {
			throwError();
		}
	}

	private static boolean isProperLength(String str) {
		return str.length() == NUMBER_COUNT;
	}

	private static boolean isProperNumber(String str) {
		int number = 0;
		try {
			number = Integer.parseInt(str);

			if (number < NUMBER_MINIMUM || NUMBER_MAXIMUM < number) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private static boolean isDuplicated(String[] numbers) {
		HashSet<String> removedNumbers = new HashSet<>(Arrays.asList(numbers));
		return removedNumbers.size() != NUMBER_COUNT;
	}
}
