package baseball.domain.Hint;

import static baseball.domain.Number.NumberFormat.*;

public class Hint {
	int ball = 0;
	int strike = 0;

	public Hint() {}

	public int getBall() {
		return this.ball;
	}

	public int getStrike() {
		return this.strike;
	}

	public void addBall() {
		ball += ADD_HINT.getNumber();
	}

	public void addStrike() {
		strike += ADD_HINT.getNumber();
	}
}
