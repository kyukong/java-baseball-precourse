package baseball.domain;

import java.util.ArrayList;

public class NewGameExceptionTest extends ExceptionTest {
	public String[] input;
	public String[] output;
	public int value;
	public int[] values;

	NewGameExceptionTest(String[] input, String[] output, int value, int[] values) {
		this.input = input;
		this.output = output;
		this.value = value;
		this.values = values;
	}

	public static ArrayList<NewGameExceptionTest> getNewGameExceptionTest() {
		ArrayList<NewGameExceptionTest> data = new ArrayList<>(MAX_EXCEPTION);

		String[] input = {"246", "135", "3"};
		String[] output = {"낫싱", "3스트라이크", "게임 종료"};
		int value = 1;
		int[] values = {3, 5};
		data.add(new NewGameExceptionTest(input, output, value, values));

		return data;
	}
}
