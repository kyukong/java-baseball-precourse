package baseball.view;

import static baseball.type.NumberFormat.*;
import static baseball.type.GameType.*;

public class Print {
	private static final String INPUT_NUMBERS = "숫자를 입력해주세요 : ";
	private static final String WIN = NUMBER_COUNT.getNumber() + "개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
		+ "게임을 새로 시작하려면  " + NEW_GAME.getNumber() + ", 종료하려면 " + END_GAME.getNumber() + "를 입력하세요.";

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

	public static void printWin() {
		println(WIN);
	}
}
