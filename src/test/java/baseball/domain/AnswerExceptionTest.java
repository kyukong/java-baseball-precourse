package baseball.domain;

import java.util.ArrayList;

public class AnswerExceptionTest extends ExceptionTest {
	public String answer;

	private AnswerExceptionTest(String answer) {
		this.answer = answer;
	}

	public static ArrayList<AnswerExceptionTest> getAnswerExceptionTest() {
		ArrayList<AnswerExceptionTest> data = new ArrayList<>(MAX_EXCEPTION);

		data.add(new AnswerExceptionTest("1234"));
		data.add(new AnswerExceptionTest("012"));
		data.add(new AnswerExceptionTest("-1"));
		data.add(new AnswerExceptionTest("test"));
		data.add(new AnswerExceptionTest("112"));

		return data;
	}
}
