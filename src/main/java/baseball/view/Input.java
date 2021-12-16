package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import static baseball.validator.Validator.*;

public class Input {
	public static String inputNumbers() {
		String input = readLine();
		validateNumbers(input);

		return input;
	}

	public static String inputNewGameFlag() {
		String input = readLine();
		validateNewGameFlag(input);

		return input;
	}
}
