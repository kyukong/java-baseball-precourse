package baseball.view;

public class Print {
	private static final String INPUT_NUMBERS = "숫자를 입력해주세요 : ";

	private static void print(String str) {
		System.out.print(str);
	}

	private static void println(String str) {
		System.out.println(str);
	}

	public static void printInputNumbers() {
		print(INPUT_NUMBERS);
	}

	public static void printHint(String hint) {
		println(hint);
	}
}
