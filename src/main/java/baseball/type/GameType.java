package baseball.type;

public enum GameType {
	NEW_GAME(1),
	END_GAME(2);

	private int number;

	GameType(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}
}
