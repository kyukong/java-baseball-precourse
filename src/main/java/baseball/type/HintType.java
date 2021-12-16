package baseball.type;

public enum HintType {
	BALL("볼"),
	STRIKE("스트라이크"),
	NOTHING("낫싱");

	private String name;

	HintType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
