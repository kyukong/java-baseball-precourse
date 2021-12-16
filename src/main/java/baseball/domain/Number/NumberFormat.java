package baseball.domain.Number;

public enum NumberFormat {
	NUMBER_COUNT(3),
	NUMBER_MINIMUM(1),
	NUMBER_MAXIMUM(9),
	ADD_HINT(1),
	SPLIT("");

	private int number;
	private String string;

	NumberFormat(int number) {
		this.number = number;
	}

	NumberFormat(String string) {
		this.string = string;
	}

	public int getNumber() {
		return this.number;
	}

	public String getValue() {
		return this.string;
	}
}
