package handType;

public enum HandSequanceValue {

	HIGH_CARD(1), ONE_PAIR(2), TWO_PAIRS(3), THREE_OF_A_KIND(4), STRAIGHT(5), FLUSH(6), FULL_HOUSE(7), FOUR_OF_A_KIND(
			8), STRAIGHT_FLUSH(9);

	private final int handSequanceValue;

	private HandSequanceValue(int handSequanceValue) {
		this.handSequanceValue = handSequanceValue;
	}

	public int asInt() {
		return handSequanceValue;
	}

}
