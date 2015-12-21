package handType;

public enum CardValues {

	TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9,
			"9"), T(10, "10"), J(11, "11"), Q(12, "12"), K(13, "13"), A(14, "14");

	private final int cardValue;
	private final String handCharacterValue;

	CardValues(int handValue, String handCharacterValue) {
		this.cardValue = handValue;
		this.handCharacterValue = handCharacterValue;
	}

	public int asInt() {
		return cardValue;
	}

	public String asString() {
		return handCharacterValue;
	}
}
